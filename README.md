# JavIN
JavIN is a complete input class for your Java Projects, always updated and simple to use

## Upload JavIN into your project

First upload the JavIN.java file in your project folder, then, open the JavIN file in your editor and modify the package name:
As you will see, in the JavIN file the package looks like this:

```java
package //!! Insert your package name here !!
```

You will need to modify that with the name of YOUR package.

After this, move to the other class where you want to use JavIN to input data into variables and create an object:

```java
JavIN in = new JavIN();
```

Now you should be able to use it like this:

```java
var = in.inINT();
//or
var = in.inDOUBLE();
//or
var = in.inSTR();
//ecc...
```
