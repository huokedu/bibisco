/*
 * Copyright (C) 2014-2017 Andrea Feccomandi
 *
 * Licensed under the terms of GNU GPL License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/gpl-2.0.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY.
 * See the GNU General Public License for more details.
 *
 */
angular.
module('bibiscoApp').
component('modalbase', {
  templateUrl: 'components/common/uielements/modal/modal-base/modal-base.html',
  controller: ModalBaseController,
  bindings: {
    close: '&',
    dismiss: '&',
    mode: '@',
    resolve: '<'
  },
});

function ModalBaseController(LoggerService) {
  LoggerService.debug('Start ModalBaseController...');

  var self = this;

  self.$onInit = function() {
    self.message = self.resolve.message;
  };

  self.ok = function() {
    self.close({
      $value: 'ok'
    });
  };

  self.cancel = function() {
    self.dismiss({
      $value: 'cancel'
    });
  };

  LoggerService.debug('End ModalBaseController...');
}