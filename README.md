scalatest-multiproject-example
==============================

This project is an attempt to generate a single, consolidated HTML test report for a multi project SBT build.

In its current state, it generates independent reports for each sub-project, such
that the index.html files overwrite each other.

Compare this to how the unidoc plugin works, which generates a single set of documents that spans all sub-projects.

To see this in action, use SBT 0.13.x and then run the following tasks
> test
> unidoc

The test output is in target/test-reports/index.html
The ScalaDoc output is in target/scala-2.11/unidoc/index.html

Depending on the order of execution, the unit test index.html will contain one test or the other (or neither)
but never both.  The unidoc output contains the scaladoc for the classes across both project.
