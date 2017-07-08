public final class OptionWrongType
{
  private OptionWrongType()
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

      // Should be rejected because Integer cannot be cast to String
      case Option.Some<String> s: {
        System.out.println("Some: " + s);
        break;
      }
      case Option.None<Integer> n: {
        System.out.println("None: " + n);
        break;
      }
    }
  }
}
