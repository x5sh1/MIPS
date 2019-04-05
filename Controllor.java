public class Controllor {

	// constructor
	public Controllor() {
		System.out.println("deal with pipeline of MIPS");
	}

	//fetch fucntion
	public Stirng fetch() {
		return "instruction is fetched";
	}

	// decode function
	public String decode() {
		return "instruction is decoded";
	}

	// execute fucntion 
	public String set_execute(String instruction) {
		return instruction + " is executed"
	}

	// memory access fucntion
	public String set_memoryaccess(String instruction) {
		return "memory is accesseds";
	}

	// write back fucntion
	public String set_writeback(String instruction) {
		return "data is written into register";
	}
}