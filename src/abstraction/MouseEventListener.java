package abstraction;


public interface MouseEventListener {

    public void onClick();

    public void onRightClick();

    public void onScroll();

    public void onMiddleClick();

    public void onMove(int x, int y);

    public void onMouseOver();

    public void onMouseOut();

    public void onDrag();

    public void onPinch();

    public void onSwipe();

    public void onClickRelease();
}
