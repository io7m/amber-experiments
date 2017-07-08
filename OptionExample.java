public final class OptionExample
{
  private OptionExample()
  {

  }

  public static void main(
    final String[] args)
  {
    final Option.Some<Integer> x =
      new Option.Some<>(Integer.valueOf(23));

    show(x);
  }

  private static void show(
    final Option<Integer> x)
  {
    __match (x) {
      case null: {
        System.out.println("null");
        break;
      }
      case Option.Some s: {
        System.out.println("Some: " + s);
        break;
      }
      case Option.None n: {
        System.out.println("None: " + n);
        break;
      }
    }
  }
}
