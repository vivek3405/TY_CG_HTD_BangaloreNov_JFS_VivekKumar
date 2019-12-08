import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		
		Vector v1=new Vector();
		
		v1.addElement(24);
		v1.addElement(56);
		v1.addElement(78);
		v1.add(67);
		
		System.out.println(v1);
		
		v1.removeElement(new Integer(24));
		
		System.out.println(v1);
		
		v1.removeElementAt(2);
		
		System.out.println(v1);
		
		Object []i1=new Object[v1.size()];
		
		v1.copyInto(i1);
		
		for(int i=0;i<i1.length;i++) {
			System.out.println(i1[i]);
		}
		
		Vector v2=new Vector();
		v2.addElement(34);
		v2.addElement(56);
		
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
		
		
	}

}
