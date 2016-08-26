package seedu.addressbook.data.person;

/**
 * represents the block number of address
 * Guarantees: immutable
 */
public class Block {
	
	private String value;
	
	/**
	 * Constructor of Block
	 * @param blockNumber
	 */
	public Block(String blockNumber) {
		this.value = blockNumber;
	}
	
	/**
	 * Get the value of block number
	 */
	public String getBlockNumber() {
		return value;
	}
}
