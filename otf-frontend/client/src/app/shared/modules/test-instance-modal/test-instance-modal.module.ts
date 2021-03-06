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
import { MatInputModule, MatDialogModule, MatFormFieldModule, MatIconModule, MatButtonModule } from '@angular/material';
import { CreateTestInstanceFormModule } from '../create-test-instance-form/create-test-instance-form.module';
import { FormsModule } from '@angular/forms';
import { FilterPipeModule } from 'ngx-filter-pipe';
import { TestInstanceModalComponent } from './test-instance-modal.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    FilterPipeModule,
    MatInputModule,
    MatDialogModule,
    MatFormFieldModule,
    MatButtonModule,
    MatIconModule,
    CreateTestInstanceFormModule
    
  ],
  declarations: [TestInstanceModalComponent],
  exports: [TestInstanceModalComponent],
  entryComponents: [TestInstanceModalComponent]
})
export class TestInstanceModalModule { }
