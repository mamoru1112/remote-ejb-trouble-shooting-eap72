package sample.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloServerBRemote {
	String helloServerB();
}
