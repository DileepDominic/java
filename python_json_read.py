#!/usr/bin/python

import json

def get_request_id():
  file = open("/home/dominic/python/json/js2.json","r")
  json_file = file.read()
  parse_json = json.loads(json_file)
  a = parse_json['purchase'][0]['order_id']
  print a


get_request_id()
