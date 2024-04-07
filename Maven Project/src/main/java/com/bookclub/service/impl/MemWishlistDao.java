package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

public class MemWishlistDao implements WishlistDao {
    List<WishlistItem> wishlist;

    public MemWishlistDao() {
        this.wishlist = new ArrayList<WishlistItem>();
        this.wishlist.add(new WishlistItem("9780345339683", "The Hobbit or There and Back Again"));
        this.wishlist.add(new WishlistItem("9780261103573", "The Fellowship of the Ring"));
        this.wishlist.add(new WishlistItem("9780261102361", "The Two Towers"));
        this.wishlist.add(new WishlistItem("9780261102378", "The Return of the King"));

    }

    @Override
    public List<WishlistItem> list() {
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem item : wishlist) {
            if (item.getIsbn().equals(key)) {
                return item;
            }
        }
        return new WishlistItem();
    }
}