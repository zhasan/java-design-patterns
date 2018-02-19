package patterns.behavioral.chainofresp;

public class ChainOfResponsibilityExe {

    public static void main(String[] args) {

        System.out.println();
        IReceiver faxHandler, emailHandler;
        emailHandler = new EmailErrorHandler(null);
        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late to the destination",
                MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally",
                MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination",
                MessagePriority.High);

        raiser.RaiseMessage(m1);
        raiser.RaiseMessage(m2);
        raiser.RaiseMessage(m3);
        raiser.RaiseMessage(m4);

    }
}
/*

    GoF Definition: Avoid coupling the sender of a request to its receiver by giving more than one object a
chance to handle the request. Chain the receiving objects and pass the request along the chain until an
object handles it.

    Concept
    Here we process a series of objects one by one (i.e., in a sequential manner). A source will initiate this
processing. With this pattern, we constitute a chain where each of the processing objects can have some logic
to handle a particular type of command object. After one’s processing is done, if anything is still pending, it
can be forwarded to the next object in the chain. We can add new objects anytime at the end of a chain.

    Real-Life Example
    In an organization, there are some customer care executives who handle feedback/issues from customers
and forward those customer issues/escalations to the appropriate department in the organization. Not all
departments will start fixing an issue. The department that seems to be responsible will take a look first, and
if the department staff believe that the issue should be forwarded to another department, he/she will do that.

    Computer World Example
    Consider an application which is handling e-mail and faxes. As usual, we need to take care of the issues
reported in each of these communications. We need to introduce two error handlers—EmailErrorHandler
and FaxErrorHandler. EmailErrorHandler will handle e-mail errors only and is not responsible for fax errors.
In the same manner, FaxErrorHandler will handle fax errors and does not care about e-mail errors.
Then we can make a chain as follows: whenever our main application finds an error, it will just raise this
and forward the error with the hope that one of those handlers will handle it. The request will first come to
FaxErrorhandler—if it finds that it is a fax issue, it’ll handle the request; otherwise, it will forward the issue to
EmailErrorHandler.
Note that here our chain ends with EmailErrorHandler. But if we need to handle another type of issue
(e.g., Authentication), we can make an AuthenticationErrorHandler and put it after EmailErrorHandler.
So, now, whenever the issue cannot be fixed by EmailErrorHandler, the issue can be forwarded to
AuthenticationErrorHandler and the chain will end there.
Thus, the bottom line is as follows: the chain will end if the issue is being processed by some handler or
there are no more handlers to process it (i.e., we have reached the end of the chain).
 */