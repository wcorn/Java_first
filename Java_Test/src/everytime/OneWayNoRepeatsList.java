package everytime;

public class OneWayNoRepeatsList {
	public static int START_POSITION = 1;
	public static int SIZE = 100;
	private int CountOfEntries; // number of items
	public String[] items; // items in list

	public OneWayNoRepeatsList() {
		items = new String[SIZE];
		CountOfEntries = 0;
	}

	public OneWayNoRepeatsList(int maximumNumberOfEntries) {
		items = new String[maximumNumberOfEntries];
		CountOfEntries = 0;
	}

	public boolean isFull() {
		return CountOfEntries == items.length;
	}

	public boolean isEmpty() {
		return CountOfEntries == 0;
	}

	public void additem(String item) {
		if (isOnList(item)) {
			if (CountOfEntries == items.length) {
				System.out.println("The List is Already Full!");
				System.exit(0);
			}
		} 
		else {
			System.out.println(item);
			items[CountOfEntries] = item;
			CountOfEntries++;
		}
	}

	public String getEntryAt(int position) {
		String result = null;
		if ((1 <= position) && (position <= CountOfEntries))
			result = items[position - 1];
		return result;
	}

	public boolean atLastEntry(int position) {
		return position == CountOfEntries;
	}

	public boolean isOnList(String item) {
		boolean found = false;
		int i = 0;
		while (!found && (i <CountOfEntries)) {
			if (item.equalsIgnoreCase(items[i]))
				found = true;
			else
				i++;
		}
		return found;
	}

	public int getMaximumNumberOfEntries() {
		return items.length;
	}

	public void eraseList() {
		CountOfEntries = 0;
	}
}