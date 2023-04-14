package co.develhope.firstapi1;

import org.springframework.stereotype.Service;

//echoSame string > string
//echoReverse string > string.reverse()
@Service
public class NameService {
	public String echoSame(String name) {
		return name;
	}

	public String echoReverse(String name){
		StringBuilder stringBuilder = new StringBuilder(name);
		stringBuilder = stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
