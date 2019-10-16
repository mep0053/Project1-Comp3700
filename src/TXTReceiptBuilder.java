public class TXTReceiptBuilder implements IReceiptBuilder {

    StringBuilder sb = new StringBuilder();

    @Override
    public void appendHeader(String header) {
        sb.append(header).append("\n");
    }

    @Override
    public void appendCustomer(CustomerModel customer) {
        sb.append("Customer ID: ").append(customer.mCustomerID).append("\n");
        sb.append("Name: ").append(customer.mName).append("\n");
	sb.append("Phone: ").append(customer.mPhone).append("\n");
	sb.append("Address: ").append(customer.mAddress).append("\n");
    }

    @Override
    public void appendProduct(ProductModel product) {
	sb.append("Product ID: ").append(product.mProductID).append("\n");
	sb.append("Name: ").append(product.mProductName).append("\n");
	sb.append("Price: ").append(product.mProductPrice).append("\n");
	sb.append("Quantity: ").append(product.mProductQuantity).append("\n");
    }

    @Override
    public void appendPurchase(PurchaseModel purchase) {
	sb.append("Purchase ID: ").append(purchase.mPurchaseID).append("\n");
	sb.append("Customer ID: ").append(purchase.mCustomerID).append("\n");
	sb.append("Product ID: ").append(purchase.mProductID).append("\n");
	sb.append("Price: ").append(purchase.mPrice).append("\n");
	sb.append("Quantity: ").append(purchase.mQuantity).append("\n");
	sb.append("Cost: ").append(purchase.mCost).append("\n");
	sb.append("Tax: ").append(purchase.mTax).append("\n");
	sb.append("Total: ").append(purchase.mTotal).append("\n");
	sb.append("Date").append(purchase.mDate).append("\n");
    }

    @Override
    public void appendFooter(String footer) {
        sb.append(footer).append("\n");
    }
}
