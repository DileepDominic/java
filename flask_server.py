from flask import Flask, abort, request 
import json
import socket
import hashlib

app = Flask(__name__)


@app.route('/hashvalue', methods=['POST']) 
def hashvalue():
    data1=request.data
    hash_object = hashlib.md5(data1)
    return str(hash_object.hexdigest())


if __name__ == '__main__':
    app.run(host='localhost', port=80, debug=True)
    
