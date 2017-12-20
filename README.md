# Hibernate ORM 5 as Java 9 automatic modules

A simple test bed for using Hibernate ORM 5 as (automatic) JPMS modules.
Some things noteworthy:

* Almost all dependencies are used as automatic modules, with the exception of `java.transaction` and `java.persistence`;
* The JDK's `java.transaction` module is upgraded with _org.jboss.spec.javax.transaction:jboss-transaction-api\_1.2\_spec:2.0.0.Alpha1_, which adds all JTA types (with the exception of the XA package conflicting with the _java.sql_ module)
* _hibernate-jpa-2.1-api-1.0.0.Final.jar_ can't be used as an automatic module as the naming algorithm stumples upon the "2.1" within the JAR name; so instead ModiTect (https://github.com/moditect/moditect/) is used to convert the JPA API JAR into an explicit JPMS module

All modules are gathered in _target/modules_, a simple test is run using the _maven-exec-plugin_ based on this module path.
