/*  Copyright (c) 2019 AT&T Intellectual Property.                             #
#                                                                              #
#   Licensed under the Apache License, Version 2.0 (the "License");            #
#   you may not use this file except in compliance with the License.           #
#   You may obtain a copy of the License at                                    #
#                                                                              #
#       http://www.apache.org/licenses/LICENSE-2.0                             #
#                                                                              #
#   Unless required by applicable law or agreed to in writing, software        #
#   distributed under the License is distributed on an "AS IS" BASIS,          #
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   #
#   See the License for the specific language governing permissions and        #
#   limitations under the License.                                             #
##############################################################################*/


import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TestHeadModalComponent } from './test-head-modal.component';
import { FormsModule } from '@angular/forms';
import { FilterPipeModule } from 'ngx-filter-pipe';
import { MatButtonModule, MatInputModule, MatRadioModule, MatDialogModule, MatFormFieldModule, MatIconModule, MAT_DIALOG_DEFAULT_OPTIONS } from '@angular/material';
import { CreateTestHeadFormModule } from '../create-test-head-form/create-test-head-form.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    FilterPipeModule,
    MatButtonModule,
    MatInputModule,
    MatRadioModule,
    MatDialogModule,
    MatIconModule,
    MatFormFieldModule,
    CreateTestHeadFormModule
  ],
  declarations: [TestHeadModalComponent],
  exports: [TestHeadModalComponent],
  entryComponents: [TestHeadModalComponent],
  providers: [{provide: MAT_DIALOG_DEFAULT_OPTIONS, useValue: {hasBackdrop: true}}]
})
export class TestHeadModalModule { }
