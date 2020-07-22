$(document).ready(function () {
    $('#input-img-pro-0').on('change',function () {
        let fd = new FormData();
        jQuery.each(jQuery('.input-img-pro')[0].files, function(i, file) {
            fd.append('file', file);
        });
        $.ajax({
            url: '/api/storage/uploadFile',
            type: "POST",
            data: fd,
            contentType: false,
            processData: false,
            cache: false,
            success: function (response) {
                $('.image-url').val(response);
                $('#img-show-pro-0').attr("src", response)
            }
        })
    })
});


