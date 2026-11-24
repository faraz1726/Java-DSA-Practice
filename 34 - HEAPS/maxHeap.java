
import java.util.ArrayList;

public class maxHeap {
   public maxHeap() {
   }

   public static void main(String[] var0) {
      heap var1 = new heap();
      var1.add(3);
      var1.add(4);
      var1.add(1);
      var1.add(5);

      while(!var1.isEmpty()) {
         System.out.println(var1.peek());
         var1.remove();
      }

   }

   static class heap {
      ArrayList<Integer> arr = new ArrayList();

      heap() {
      }

      public void add(int var1) {
         this.arr.add(var1);
         int var2 = this.arr.size() - 1;

         for(int var3 = (var2 - 1) / 2; (Integer)this.arr.get(var2) > (Integer)this.arr.get(var3); var3 = (var3 - 1) / 2) {
            int var4 = (Integer)this.arr.get(var2);
            this.arr.set(var2, (Integer)this.arr.get(var3));
            this.arr.set(var3, var4);
            var2 = var3;
         }

      }

      public int peek() {
         return (Integer)this.arr.get(0);
      }

      private void heapify(int var1) {
         int var2 = 2 * var1 + 1;
         int var3 = 2 * var1 + 2;
         int var4 = var1;
         if (var2 < this.arr.size() && (Integer)this.arr.get(var1) < (Integer)this.arr.get(var2)) {
            var4 = var2;
         }

         if (var3 < this.arr.size() && (Integer)this.arr.get(var4) < (Integer)this.arr.get(var3)) {
            var4 = var3;
         }

         if (var4 != var1) {
            int var5 = (Integer)this.arr.get(var1);
            this.arr.set(var1, (Integer)this.arr.get(var4));
            this.arr.set(var4, var5);
            this.heapify(var4);
         }

      }

      public int remove() {
         int var1 = (Integer)this.arr.get(0);
         int var2 = (Integer)this.arr.get(0);
         this.arr.set(0, (Integer)this.arr.get(this.arr.size() - 1));
         this.arr.set(this.arr.size() - 1, var2);
         this.arr.remove(this.arr.size() - 1);
         this.heapify(0);
         return var1;
      }

      public boolean isEmpty() {
         return this.arr.size() == 0;
      }
   }
}
