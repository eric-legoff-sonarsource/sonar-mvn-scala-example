package org.elegoff

object HelloServiceScala {

  def hello =
  {
    "Hello"
  }

}

def foo(a: Int) {
  val i = 10;
  return a + i;       // Noncompliant
  hello;                // dead code
}