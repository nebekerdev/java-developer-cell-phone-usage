# Cell Phone Usage Report Generator

### Current Assumptions
I am currently assuming that the data in the csv files pertaining to 
date and minutes are formatted consistently and no parsing or error checking
will need to be performed.

I assume the user should be able to input a year via command line and print the
document to their local printer.

### Current design choices

The only current design choice is to use standard Java methods to parse the CSV file.
OpenCSV would also work but requires adding additional libraries to the tech stack and
I would like to keep this as simple as possible.
