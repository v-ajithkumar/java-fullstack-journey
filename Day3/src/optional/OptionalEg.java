package optional;

import java.util.Optional;

public class OptionalEg {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[2] = "program";

		String name = "math";

		// isPresent
		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) {
			System.out.println(str[5].toLowerCase());
		} else {
			System.out.println("word is not present");
		}

		// empty()
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// get()
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		System.out.println(value.get());

		// ifPresent()
		Optional<String> namestr = Optional.of(name);
		namestr.ifPresent(n -> System.out.println("value is present :" + n));

		// empty() , orElse()
		String valueNul = null;
		Optional<String> nullOp = Optional.empty();
		System.out.println(nullOp.orElse("Another String"));

		// orElse() and orElseGet()

		Optional<String> nullp = Optional.ofNullable(valueNul);
		System.out.println(nullp);
		nullp.orElse(test1());
//		nullp.orElseGet(()-> test1());
		namestr.orElseGet(() -> test1());

		// orElseThrow()
		String name3 = null;
		Optional<String> name3opt = Optional.empty();
//		String res = name3opt.orElseThrow(); //Optional is empty, it throws NoSuchElementException.
//		String result = name3opt.orElseThrow(() -> new RuntimeException("Name not found")); //custom exception

	}

	private static String test1() {
		System.out.println("inside test....");
		return "Default value";
	}
}
