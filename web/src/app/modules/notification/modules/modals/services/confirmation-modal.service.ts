import { Injectable } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { SpecmateDataService } from '../../../../data/modules/data-service/services/specmate-data.service';
import { TranslateService } from '@ngx-translate/core';
import { TypedModalContent } from '../components/typed-modal-content.component';
import { Dialogtype } from '../modal-dialog-type';

@Injectable()
export class ConfirmationModal {
    constructor(private modalService: NgbModal, private dataService: SpecmateDataService, private translate: TranslateService) { }

    public open(message: string, withCancel = true): Promise<any> {
        const modalRef = this.modalService.open(TypedModalContent);
        modalRef.componentInstance.options = Dialogtype.unsavedChangesDialog(message, withCancel);
        return modalRef.result;
    }

    public confirmSave(message?: string): Promise<void> {
        if (this.dataService.hasCommits) {
            return this.open(message || this.translate.instant('confirmSave'));
        }
        return Promise.resolve();
    }
}
