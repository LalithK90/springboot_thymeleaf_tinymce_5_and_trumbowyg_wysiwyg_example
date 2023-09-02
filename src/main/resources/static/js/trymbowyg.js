
// MathJax inline configuration
MathJax.Hub.Config({
    tex2jax: {
        inlineMath: [
            ['$', '$'],
            ['\\(', '\\)']
        ]
    }
});

$('textarea')
    .trumbowyg({
        svgPath: './dist/ui/icons.svg',
        changeActiveDropdownIcon: true,
        removeformatPasted: true,
        autogrow: true,
        autogrowOnEnter: true,
        imageWidthModalEdit: true,
        urlProtocol: true,
        tagClasses: {
            // Bootstrap example
            h1: 'h1',
            table: 'table table-border',
        },
        btnsDef: {
            // Create a new dropdown
            image: {
                dropdown: ['base64', 'insertImage', 'noembed'],
                ico: 'insertImage'
            },
            align: {
                dropdown: ['justifyLeft', 'justifyCenter', 'justifyRight', 'justifyFull'],
                ico: 'justifyCenter'
            },
            list: {
                dropdown: ['unorderedList', 'orderedList'],
                ico: 'orderedList'
            },

        },
        btns: [
            ['viewHTML'],
            ['preformatted'],
            ['historyUndo', 'historyRedo'],
            ['formatting'],
            ['fontfamily'], ['fontsize'],
            ['strong', 'em', 'del'],
            ['superscript', 'subscript'],
            ['emoji'],
            ['mathml'],
            ['specialChars'],
            ['link'],
            ['image'],
            ['table', 'tableCellBackgroundColor', 'tableBorderColor'],
            ['foreColor', 'backColor'],
            ['list'],
            ['align'],
            ['indent', 'outdent'],
            ['lineheight'],
            ['horizontalRule'],
            ['removeformat'],
            ['ruby'],
            ['fullscreen']
        ],
        plugins: {
            allowTagsFromPaste: {
                allowedTags: ['h4', 'p', 'br']
            },
            resizimg: {
                minSize: 64,
                step: 16,
            }
        }
    }); // Listen for `tbwfocus` event
