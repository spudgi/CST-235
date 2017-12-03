package CLC;

import com.sun.org.glassfish.gmbal.ManagedObject;

@ManagedObject (name = "managedBean", eager = true)

public class helloBean {

private String message;
	
	public helloBean (){
		setMessage("Hello World");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
