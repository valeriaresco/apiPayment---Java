# API Payment-Java
Project created for a technical test

# - Scope
Creation of an API, where payment data will be received. These being: Debit Code, Payer's CPF or CNPJ, Payment method, Card number, Payment amount. And this payment can be created, viewed, updated and deleted.

# - Requirements
- Functional:

RF1 - The API must be able to receive a payment;

RF2- The system will display an area for the user to enter the debit code being paid (full amount);

RF3- The API will display an area for the user to enter the payer's CPF or CNPJ;

RF4 - The API will display an area for the user to enter the payment method;

RF5- The API will display an area for the user to enter the payer's card number;

RF6- The API will display an area for the user to enter the payment amount;

RF7 - The API must be able to update the status of a payment;

RF8 - The API must be able to list all payments received and provide search filters for the customer.

RF9 - The user can filter the payment by debit code;

RF10 - The user will be able to filter the payment by CPF/CNPJ of the payer;

RF11 - The user can filter the payment by payment status;

RF12 - The API must be able to delete a payment.

- Non-functional:

RFN1 - The card number will only be sent if the payment method is credit_card or debit_card;

RFN2 - The status update of a payment will always contain the Payment ID and the new status;

RFN3 - When the payment is "Pending Processing", it can be changed to "Successfully Processed" or "Failed Processed";

# - Technologies Used
- Rest API
- Spring Boot
- Java 17
- H2 Database

# - How to use
Clone the repository and open the folder in Spring Tools Suit. After that, run the project.

# - How to use the routs
