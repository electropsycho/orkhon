package org.orkhon.models;

import java.util.Date;

public class BorrowItem {
    public int id;
    public int bookId;
    public int borrowTakerId;
    public int borrowGiverId;
    public Date borrowDate;
    public Date plannedReturnDate;
    public Date realReturnDate;
}
