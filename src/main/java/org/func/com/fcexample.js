var getRawBody = require('raw-body');
var getFormBody = require("body/form");
var body = require('body');

module.exports.handler = function(req, resp, context) {
    console.log("hello world");

    var params = {
        path: req.path,
        queries: req.queries,
        headers: req.headers,
        method : req.method,
        requestURI : req.url,
        clientIP : req.clientIP,
    }

    getRawBody(req, function(err, body) {
        for (var key in req.queries) {
            var value = req.queries[key];
            resp.setHeader(key, value);
        }
        params.body = body.toString();
        resp.send(JSON.stringify(params, null, '    '));
    });


}
