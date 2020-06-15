const express = require('express')
const app = express()
const port = 3000

let logRequest = (req)=>{
  console.log(`URL: ${JSON.stringify(req.url)}`)
  console.log(`Headers: ${JSON.stringify(req.headers)}`)
  console.log(`Method: ${JSON.stringify(req.method)}`)
  console.log(`Body: ${JSON.stringify(req.body)}`)
  console.log(`Query: ${JSON.stringify(req.query)}`)
  console.log("\n")
}
let authchecker = (req)=>{
  if(req.headers.authorization == null)
    return 401
  else if(req.headers.authorization !== "Basic SW5zb21uaWE6SW5zb21uaWFQYXNzd29yZA==")
    return 403
  return 200
}

app.use(express.json())

app.get('/*', (req, res)=>{
  logRequest(req);
  let status = authchecker(req);
  res.status(status).json({MockServer: "Mock server response"})
})
app.post('/*', (req, res)=>{
  logRequest(req);
  let status = authchecker(req);
  res.status(status).json({MockServer: "Mock server response"})
})
app.put('/*', (req, res)=>{
  logRequest(req);
  let status = authchecker(req);
  res.status(status).json({MockServer: "Mock server response"})
})

app.delete('/*', (req, res)=>{
  logRequest(req);
  let status = authchecker(req);
  res.status(status).json({MockServer: "Mock server response"})
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))

