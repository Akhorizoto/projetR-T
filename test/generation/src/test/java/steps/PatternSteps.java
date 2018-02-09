package steps;
import cucumber.api.java.en.Then;
public class PatternSteps {
@Then("assert the consequences of the pattern security_pattern")
public void asssecuritypattern(){
// in order to test the presence of security_pattern pattern
//try to assert one of the following consequences :

    //Consequences
}
@Then("assert the consequences of the pattern application firewall")
public void assapplicationfirewall(){
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //The institution policies to control access are easily defined and administered, as the policies have centralized administration. This makes the whole system less complex, and thus more secure.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //This firewall could be combined with an Intrusion Detection System to facilitate the prevention of some attacks.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //The firewall lends itself to a systematic logging of incoming and outgoing messages.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //As authentication of Clients is performed, users can be held responsible for their actions.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //New applications are easily integrated into the system by adding their specific policies.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //New clients can be accommodated by adding new policies to the policy base of an application.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //Because of their separation, the application and the filtering policies can evolve independently.The pattern also has some (possible)liabilities:
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //The application could affect the performance of the protected system as it is a bottleneck in the network. This can be improved by considering the firewall a virtual concept and using several machines for implementation.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //The solution is intrusive for existing applications that already implement their own access control.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //The application itself must be built in a secure way or normal access to commands could allow attacks through the requests.
// in order to test the presence of application firewall pattern
//try to assert one of the following consequences :

    //We still need the operating system and the network infrastructure to be secure.
}
@Then("assert the consequences of the pattern audit interceptor")
public void assauditinterceptor(){
// in order to test the presence of audit interceptor pattern
//try to assert one of the following consequences :

    //Centralized, declarative auditing of service requests. The Audit Interceptor centralizes the auditing code within the application. This promotes reuse and maintainability.
// in order to test the presence of audit interceptor pattern
//try to assert one of the following consequences :

    //"Pre-and post-process audit handling of service requests. The Audit Interceptor enables developers to record audit events prior to a method call or after a method call. This is important when considering the business requirements. Auditing is often required prior to the service or method call as a form of recording an""attempt.""In other cases, an audit event is required only after the outcome of the call has been decided. And finally, there are cases where an audit event is needed in the event of an exception with the call."
// in order to test the presence of audit interceptor pattern
//try to assert one of the following consequences :

    //Auditing of services decoupled from the services themselves. The Audit Interceptor pattern decouples the business logic code from the auditing code. Business developers should not have to consider auditing requirements or implement code to support auditing. By using the Audit Interceptor, auditing can be achieved without impacting business developers.
// in order to test the presence of audit interceptor pattern
//try to assert one of the following consequences :

    //Supports evolving requirements and increases maintainability. The Audit Interceptor supports evolving auditing requirements by decoupling the events that need to be audited from the implementation. An audit catalog can be created that defines audit events declaratively, thus allowing different event types for different circumstances to be added without changing code. This improves the overall maintainability of the code by reducing the number of changes to it.
// in order to test the presence of audit interceptor pattern
//try to assert one of the following consequences :

    //Reduces performance. The cost of using an interceptor pattern is that performance is reduced anytime the interceptor is invoked. Every time that Audit Interceptor determines that a request or response does not require generation of an audit event, it unnecessarily decreases performance.
}
@Then("assert the consequences of the pattern comparator checked fault tolerant system")
public void asscomparatorcheckedfaulttolerantsystem(){
// in order to test the presence of comparator checked fault tolerant system pattern
//try to assert one of the following consequences :

    //Improves system tolerance of component faults.
// in order to test the presence of comparator checked fault tolerant system pattern
//try to assert one of the following consequences :

    //Substantially increases component costs.
// in order to test the presence of comparator checked fault tolerant system pattern
//try to assert one of the following consequences :

    //Increases system complexity. Creating the Memento may require the creation of work queues or other transaction management constructs to ensure consistency of the state data stored in the Memento. Creating the Comparator and its recovery function will also add complexity.
// in order to test the presence of comparator checked fault tolerant system pattern
//try to assert one of the following consequences :

    //May impair system latency or throughput if creation of a checkpoint requires processing to pause or stop.
}
@Then("assert the consequences of the pattern input guard")
public void assinputguard(){
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //It stops the contamination of the guarded component from erroneous input that does not conform to the specification of the guarded component.
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //The undefined behavior of the guard in the presence of errors allows its combination with error detection and error masking patterns, and fault diagnosis mechanisms. Whenever this is applicable, the system benefits in terms of reduced run-time overhead introduced by the implementation of the fault tolerant mechanism (e. g. the combination of fault containment and error detection in the context of system recovery from errors).
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //The similarities between the guard entities of the Input Guard pattern and Output Guard pattern (see Section3)allow the combination of the two in a single entity. This entity will operate on the same data and will perform two checks: one against the specification of the component that produced the data as output and the other against the specification of the component that will consume the data as input. When applicable, this combination can provide significant benefits in terms of time and space overhead since two separate checks will be performed by the same piece of code.
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //There are various ways that the Input Guard pattern can be implemented, each providing different benefits with respect to the time or space overhead introduced by the guard. It is also possible to integrate the guard with an existing system without having to modify the internals of the system components (first implementation alternative). That reduces significantly the amount of system re-engineering required for applying the Input Guard pattern to COTS-based systems made of black-box components.The Input Guard pattern imposes also some liabilities:
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //It is not possible to minimize both the time and the space overhead of this pattern. To keep low the time overhead introduced by the Input Guard pattern, the functionality of the guard must not be very time consuming. This results in a tendency to introduce a separate guard for each different access point (e. g. one guard per interface or even per operation declared in an interface)of the guarded component. Each such guard checks only a small part of the specification of the guarded component, minimizing thus the execution time of an individual guard. However, this results in a large number of guards, hence in an elevated space overhead. On the other hand, to keep low the space overhead introduced by the Input Guard pattern, the number of guards needs to remain as small as possible. This implies that each guard will have to check a lager number of input for the guarded component, becoming a potential bottleneck and thus penalizing the performance of the system with elevated time overhead.
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //For certain systems that require guards to be implemented as components (e. g. systems composed from black-box COTS software), the Input Guard pattern results unavoidably to an elevated time and space overhead. The space overhead is due to the introduction of the new components implementing the guards. The time overhead is due to the fact that passing input to the guarded component requires one additional indirection through the component implementing the guard that check the given input.
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //The Input Guard pattern cannot prevent the propagation of errors that do conform with the specification of the guarded component. Such errors may contaminate the state of the guarded component if it has one. Although these errors cannot cause a failure on the guarded component since it operates according to its specification, they can cause a failure on the rest of the system. Such a failure of the entire system will be traced back to an error detected in the contaminated guarded component. Unless the error detection and fault diagnosis capabilities of the system allow to continue tracing the error until the initial fault that caused it, it is possible that inappropriate recovery actions will be taken targeted only at the guarded component, which, nonetheless, has been operating correctly according to its specification.
// in order to test the presence of input guard pattern
//try to assert one of the following consequences :

    //The Input Guard pattern can effectively protect a component from being contaminated by erroneous input according to its specification. However, unless it is combined with some error detection and system recovery mechanisms, this pattern will result in a receive-omission failure (i. e. failure to receive input)of the guarded component. For certain systems, such a failure of one of their components may cause a failure on the entire system. Hence, the Input Guard pattern has limited applicability to such systems if it is not combined with other fault tolerance patterns.
}
@Then("assert the consequences of the pattern output guard")
public void assoutputguard(){
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //It confines an error to the component where it occurred by forwarding to the component's environment only output that conforms to the specification of the component.
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //The undefined behavior of the guard in the presence of errors allows its combination with error detection and error masking patterns, and fault diagnosis mechanisms. Whenever this is applicable, the system benefits in terms of reduced run-time overhead introduced by the implementation of the fault tolerant mechanism (e. g. the combination of fault containment and error detection in the context of system recovery from errors).
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //The similarities between the guard entities of the Input Guard and Output Guard patterns allow the combination of the two in a single entity. This entity will operate on the same data and will perform two checks: one against the specification of the component that produced the data as output and the other against the specification of the component that will consume the data as input. When applicable, this combination can provide significant benefits in terms of time and space overhead since two separate checks will be performed by the same piece of code.
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //There are various ways that the Output Guard pattern can be implemented, each providing different benefits with respect to the time or space overhead introduced by the guard. It is also possible to integrate the guard with an existing system without having to modify the internals of the system components (first implementation alternative). That reduced significantly the amount of system re-engineering required for applying the Output Guard pattern to COTS-based systems made of black-box components.The Output Guard pattern imposes also some liabilities, similar to those of the Input Guard pattern:
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //It is not possible to minimize both the time and the space overhead of this pattern. To keep low the time overhead introduced by the Output Guard pattern, the functionality of the guard must not be very time consuming. This results in a tendency to introduce a separate guard for each different exit point (e. g. one guard per invocation-return or per message-send)of the guarded component. Each such guard checks only a small part of the specification of the guarded component, minimizing thus the execution time of an individual guard. However, this results in a large number of guards, hence in an elevated space overhead. On the other hand, to keep low the space overhead introduced by the Output Guard pattern, the number of guards needs to remain as small as possible. This implies that each guard will have to check a lager number of output for the guarded component, becoming a potential bottleneck and thus penalizing the performance of the system with elevated time overhead.
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //For certain systems that require guards to be implemented as components (e. g. systems composed from black-box COTS software), the Output Guard pattern results unavoidably to an elevated time and space overhead. The space overhead is due to the introduction of the new components implementing the guards. The time overhead is due to the fact that passing output from the guarded component to its environment requires one additional indirection through the component implementing the guard that check the given output.
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //The Output Guard pattern cannot prevent the propagation of errors that do conform with the specification of the guarded component. Such errors are not due to a malfunction of the guarded component and do not affect its internal state. Although these errors do not have their source in the guarded component which is checked to produce output according to its specification, they can cause a failure on the rest of the system. Such a failure of the entire system will be traced back to an error detected in the guarded component. Unless the error detection and fault diagnosis capabilities of the system allow the detection of faults in the system design, it is highly probable that inappropriate recovery actions will be taken targeted at the guarded component, which, nonetheless, has been operating correctly according to its specification.
// in order to test the presence of output guard pattern
//try to assert one of the following consequences :

    //The Output Guard pattern can effectively protect the component�s environment from being contaminated by erroneous output produced by the component according to its specification. However, unless it is combined with some error detection and system recovery mechanisms, this pattern will result in a send-omission failure (i. e. failure to deliver output)of the guarded component. For certain systems, such a failure of one of their components may cause a failure on the entire system. Hence, the Output Guard pattern has limited applicability to such systems if it is not combined with other fault tolerance patterns.
}
@Then("assert the consequences of the pattern pathname canonicalization")
public void asspathnamecanonicalization(){
// in order to test the presence of pathname canonicalization pattern
//try to assert one of the following consequences :

    //Pathname canonicalization guarantees that textual analysis of the canonicalized pathname yields accurate results, which improves the accuracy and security of file access.
// in order to test the presence of pathname canonicalization pattern
//try to assert one of the following consequences :

    //The program speed is degraded due to the canonicalization of pathnames. To reduce the overhead of canonicalization, it is possible to cache the canonicalized pathname. Note that such caching assumes that the directory structure accessed by the program is not changed during program execution.
}
@Then("assert the consequences of the pattern secure logger")
public void asssecurelogger(){
// in order to test the presence of secure logger pattern
//try to assert one of the following consequences :

    //Centralizes logging control. The Secure Logger improves reusability and maintainability by centralizing logging control and decoupling the implementation details from the API. This allows developers to use the logging facilities through the API independent of the security functionality built into the logger itself. This reduces the possibility that business developers will inadvertently circumvent security by misusing it.
// in order to test the presence of secure logger pattern
//try to assert one of the following consequences :

    //Prevents undetected log alteration. The key to successfully compromising a system or application is the ability to cover your tracks. This involves alteration of log files to ensure that an administrator cannot detect that a breach has occurred. By employing a Secure Logger, security developers can prevent log alterations, ensuring that a breach can be detected through log file forensics, which is the first step in tracking down an intruder and preventing security breaches.
// in order to test the presence of secure logger pattern
//try to assert one of the following consequences :

    //Reduces performance. The Secure Logger impacts performance due to the use of cryptographic algorithms. Operations such as message digests, digital signatures, and encryption are computationally expensive and add additional performance overhead. Use only the necessary functionality to avoid unwanted performance overhead. Reduced performance can lead to a self-inflicted denial of service attack.
// in order to test the presence of secure logger pattern
//try to assert one of the following consequences :

    //Promotes extensibility. Security is a constantly evolving process. To protect against both current and future threats, code must be adaptable and extensible. The Secure Logger provides the requisite extensibility by hiding implementation details behind a generic interface. By increasing the overall lifespan of the code, you increase its reliability by having tested it and worked out all of its bugs.
// in order to test the presence of secure logger pattern
//try to assert one of the following consequences :

    //Improves manageability. Since all of the logging control is centralized, it is easier to manage and monitor. The Secure Logger performs all of the necessary security processing prior to the actual logging of the data, which allows management of each function independently of the others without risk of impacting overall security.
}
}
