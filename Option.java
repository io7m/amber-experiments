public abstract class Option<T>
{
  private Option()
  {

  }

  public static final class Some<T> extends Option<T>
  {
    private final T value;

    public Some(
      final T x)
    {
      this.value = x;
    }
  }

  public static final class None<T> extends Option<T>
  {
    public None()
    {

    }
  }
}
