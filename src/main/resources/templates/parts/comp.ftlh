<#macro page>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="/static/bt.css"/>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width,maximum-scale=1.0,initial-scale=1.0,user-scalable=no"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/turbolinks/5.2.0/turbolinks.js" type="text/javascript"></script>
        <title>Гладиаторы онлайн</title>
    </head>
    <body style="-webkit-text-size-adjust:none;">
    <div id="topdiv">
        <div class="main" style="word-wrap:break-word;">
            <#nested>
        </div>
    </div>
    </body>
    </html>
</#macro>