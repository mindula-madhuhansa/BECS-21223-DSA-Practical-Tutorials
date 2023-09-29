public class Book {
        private String bookId;
        private String bookTitle;
        private int availableCopies;
        private int numberOfTimesBorrowed;
        private int numberOfRequests;
        public Book(String bookId, String bookTitle, int availableCopies, int
                numberOfTimesBorrowed) {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.availableCopies = availableCopies;
            this.numberOfTimesBorrowed = numberOfTimesBorrowed;
        }
        public Book(String bookId, String bookTitle, int numberOfRequests) {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.numberOfRequests=numberOfRequests;
        }
        public String getBookId() {
            return bookId;
        }
        public String getBookTitle() {
            return bookTitle;
        }
        public int getAvailableCopies() {
            return availableCopies;
        }
        public void setAvailableCopies(int availableCopies) {
            this.availableCopies = availableCopies;
        }
        public int getNumberOfTimesBorrowed() {
            return numberOfTimesBorrowed;
        }
        public void setNumberOfTimesBorrowed(int numberOfTimesBorrowed) {
            this.numberOfTimesBorrowed = numberOfTimesBorrowed;
        }
        public int getNumberOfRequests() {
            return numberOfRequests;
        }
        public void setNumberOfRequests(int numberOfRequests) {
            this.numberOfRequests = numberOfRequests;
        }
}
