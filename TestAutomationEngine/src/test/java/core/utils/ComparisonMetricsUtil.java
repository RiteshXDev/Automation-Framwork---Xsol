package core.utils;

public class ComparisonMetricsUtil {

        private static final ThreadLocal<Double> totalSimilarity =
                ThreadLocal.withInitial(() -> 0.0);

        private static final ThreadLocal<Integer> comparisonCount =
                ThreadLocal.withInitial(() -> 0);

        public static void addSimilarity(double similarity)
        {
            totalSimilarity.set(
                    totalSimilarity.get() + similarity
            );

            comparisonCount.set(
                    comparisonCount.get() + 1
            );
        }

        public static double getAverageSimilarity()
        {
            if (comparisonCount.get() == 0)
            {
                return 0.0;
            }

            return totalSimilarity.get() / comparisonCount.get();
        }

        public static int getComparisonCount()
        {
            return comparisonCount.get();
        }

        public static void clear()
        {
            totalSimilarity.remove();
            comparisonCount.remove();
        }
    }

