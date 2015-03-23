$(function() {
    $("table").addClass("table");
    $("p > img").addClass("img-responsive");

    // toc
    $("body").toc({
        startLevel: 'h2',
        endLevel: 'h3',
        listType: 'ol'
    });

    // collapse
    $(".collapse").collapse()

    // lazyload of image
    $("img").lazyload();

    // external link must be opened in blank window
    $("a[href^='http']:not([href*='" + location.hostname + "'])").attr('target', '_blank');

    $(document).delegate('*[data-toggle="lightbox"]', 'click', function(event) {
        event.preventDefault();
        $(this).ekkoLightbox();
    });

    // page-top link
    var pageTop = $("#page-top");
    pageTop.click(function () {
        $('body, html').animate({ scrollTop: 0 }, 500);
        return false;
    });
    $(window).scroll(function () {
        if($(this).scrollTop() >= 200) {
            pageTop.css( "bottom", "10px" );
        } else {
            pageTop.css( "bottom", "-60px" );
        }
    });

});
