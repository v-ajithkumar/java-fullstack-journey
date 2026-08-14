function Cart(){
    const cartItems = 5;
    return (
        <>
        {
            cartItems > 0 && <button>Checkout</button>
        }
        </>
    );
}
export default Cart