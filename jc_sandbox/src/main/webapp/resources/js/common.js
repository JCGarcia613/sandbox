Solutionary = {
    utils : {
        returnValue : function(formId, elemId, value) {
            var element = window.opener.document.forms[formId].elements[elemId];
            if (element != null) {
                element.value = value;
                element.focus();
            }

            window.close();
        },
        scrollToPageBottom : function() {
            Solutionary.utils.scrollTo('footerDiv');
        },
        scrollTo : function(elementId) {
            document.getElementById(elementId).scrollIntoView(false);
        },
        setTableRowEditable : function(row) {
            jQuery('.ui-icon-pencil')[row].id = 'addedRow' + row;
              jQuery('#addedRow' + row).trigger('click');
           }
    }
};

/*
 * This prevents calendar components from beginning selected and expanded as
 * soon as the page is loaded.
 */
PrimeFaces.widget.Dialog.prototype.applyFocus = function() {
    var firstInput = this.jq
            .find(':not(:submit):not(:button):input:visible:enabled:first');
    if (!firstInput.hasClass('hasDatepicker')) {
        firstInput.focus();
    }
};

$(function() {
    if (document.getElementById('pageBody')) {
        var viewportHeight;
        if (document.compatMode === 'BackCompat') {
            viewportHeight = document.body.clientHeight;
        } else {
            viewportHeight = document.documentElement.clientHeight;
        }
        document.getElementById('pageBody').style.minHeight = viewportHeight - 150 + 'px';
    }
});

function handlePFDialogOnComplete(xhr, status, args, dialogWidgetVar) {
    if (!args.validationFailed) {
        PF(dialogWidgetVar).hide();
    }
}