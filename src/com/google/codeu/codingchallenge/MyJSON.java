// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {


  public HashMap<String, JSON> map;
  map.set("name", JSON.parse(value))
  //constructor
  public MyJSON() {
    map = new HashMap();
  }

  // Get the value of the nested object with the given name. If there is
  // no nested object with that name, the method will return null.
  @Override
  public JSON getObject(String name) {
    if (map.containsKey(name) {
      firstValue = map.get(name); //first value is another object
      value = firstValue.get(name)
      return value;
    else {
      return null;
      }
    }
  }

  // Set the value of the nested object with the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  @Override
  public JSON setObject(String name, JSON value) {
    map.put(name, value);
    return this;
  }


  // Get the string value within this object that has the given name. if
  // there is no string with the given name, the method will return null.
  @Override
  public String getString(String name) {
    if (map.containsKey(name) {
      value = map.get(name);
      return value;
    else {
      return null;
      }
    }
  }

  // Set the string that should be stored under the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  @Override
  public JSON setString(String name, String value) {
    map.get(name) = value
    return this;
  }

  // Copy the names of all object values to the given collection.
  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
  }

  // Copy the names of all string values to the given collection.
  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
  }
}
