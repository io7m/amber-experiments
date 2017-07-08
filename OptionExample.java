public final class OptionExample
{
  private OptionExample()
  {

  }

  public static void main(
    final String[] args)
  {
    final Option.Some<Integer> x0 =
      new Option.Some<>(Integer.valueOf(23));
    final Option.None<Integer> x1 =
      new Option.None<>();

    show(x0);
    show(x1);
  }

  private static void show(
    final Option<Integer> x)
  {
    __match (x) {
      case null: {
        throw new AssertionError("Unreachable");
      }
      case Option.Some<Integer> s: {
        System.out.println("Some: " + s);
        break;
      }
      case Option.None<Integer> n: {
        System.out.println("None: " + n);
        break;
      }
      case Option<Integer> o: {
        System.out.println("Option: " + o);
        break;
      }
    }
  }
}
