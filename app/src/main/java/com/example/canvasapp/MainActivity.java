package com.example.canvasapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Canvas mCanvas;
   private Paint mPaint = new Paint();
   private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
   private Bitmap mBitmap;
   private ImageView mImageView;

   private Rect mRect = new Rect();
   private Rect mBounds = new Rect();
   private static final int OFFSET = 120;
   private int mfset = OFFSET;
   private static final int MULTIPLIER = 100;

   int mBrownLeftHair;
   int mBrownRightHair;
   int mRedEar;

   int mYellowLeftFace;
   int mYellowRightFace;

   int mColorBlackEyes;
   int mColorWhiteEyes;

   TextView tv1;
   int count;
   Button btn1;

   @SuppressLint("MissingInflatedId")
   @Override
   public void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

//      tv1 = findViewById(R.id.tv1);

      mBrownLeftHair = ResourcesCompat.getColor(getResources(), R.color.brown_left_hair, null);
      mBrownRightHair = ResourcesCompat.getColor(getResources(), R.color.brown_right_hair, null);
      mRedEar = ResourcesCompat.getColor(getResources(), R.color.red_ear, null);

      mYellowLeftFace = ResourcesCompat.getColor(getResources(), R.color.yellow_left_skin, null);
      mYellowRightFace = ResourcesCompat.getColor(getResources(), R.color.yellow_right_skin, null);

      mColorBlackEyes = ResourcesCompat.getColor(getResources(), R.color.black, null);
      mColorWhiteEyes = ResourcesCompat.getColor(getResources(), R.color.white, null);


      mImageView = findViewById(R.id.my_image_view);
      count = 1;
      mImageView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            drawSomething(view);
            count++;
         }
      });


   }

//   private void showLeftHair(View view){
//      int mWidth = view.getWidth();
//      int mHeight = view.getHeight();
//
//      int halfWidth = mWidth/2;
//      int halfHeight = mHeight/2;
//
//      mBitmap = Bitmap.createBitmap(mWidth, mHeight, Bitmap.Config.ARGB_8888);
//      mImageView.setImageBitmap(mBitmap);
//      mCanvas = new Canvas(mBitmap);
//
//      mPaint.setColor(mBrownLeftHair);
//      mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);
//   }

   public void drawSomething(View view){
      int mWidth = view.getWidth();
      int mHeight = view.getHeight();

      int halfWidth = mWidth/2;
      int halfHeight = mHeight/2;

      float left = 150f;
      float top = 250F;
      float right = mWidth - left;
      float bottom = mHeight - 50F;

      mBitmap = Bitmap.createBitmap(mWidth, mHeight, Bitmap.Config.ARGB_8888);
      mImageView.setImageBitmap(mBitmap);
      mCanvas = new Canvas(mBitmap);

      if (count == 1) {
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

      } else if(count == 2){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

      } else if (count == 3){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

      } else if (count == 4){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);
      } else if (count == 5){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);
      } else if (count == 6){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);
      } else if(count == 7){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);

         mPaint.setColor(mColorWhiteEyes);
         mCanvas.drawCircle(halfWidth - 120F, halfHeight - 20F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 80F, halfHeight - 20F, 15F, mPaint);
      } else if (count == 8){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);

         mPaint.setColor(mColorWhiteEyes);
         mCanvas.drawCircle(halfWidth - 120F, halfHeight - 20F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 80F, halfHeight - 20F, 15F, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
         RectF lip = new RectF(halfWidth - 200F, halfHeight - 100F, halfWidth + 200F, halfHeight + 400F);
         mCanvas.drawArc(lip, 25F, 130F, false, mPaint);
      } else if (count == 9){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);

         mPaint.setColor(mColorWhiteEyes);
         mCanvas.drawCircle(halfWidth - 120F, halfHeight - 20F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 80F, halfHeight - 20F, 15F, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
         RectF lip = new RectF(halfWidth - 200F, halfHeight - 100F, halfWidth + 200F, halfHeight + 400F);
         mCanvas.drawArc(lip, 25F, 130F, false, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.white, null));
         RectF mouth = new RectF(halfWidth - 180F, halfHeight, halfWidth + 180F, halfHeight + 380F);
         mCanvas.drawArc(mouth, 25F, 130F, false, mPaint);
      } else if (count == 10){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);

         mPaint.setColor(mColorWhiteEyes);
         mCanvas.drawCircle(halfWidth - 120F, halfHeight - 20F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 80F, halfHeight - 20F, 15F, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
         RectF lip = new RectF(halfWidth - 200F, halfHeight - 100F, halfWidth + 200F, halfHeight + 400F);
         mCanvas.drawArc(lip, 25F, 130F, false, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.white, null));
         RectF mouth = new RectF(halfWidth - 180F, halfHeight, halfWidth + 180F, halfHeight + 380F);
         mCanvas.drawArc(mouth, 25F, 130F, false, mPaint);

         mPaint.setColor( ResourcesCompat.getColor(getResources(), R.color.black, null));
         mCanvas.drawCircle(halfWidth - 40F, halfHeight + 140F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 40F, halfHeight + 140F, 15F, mPaint);
      } else if (count == 11){
         mPaint.setColor(mBrownLeftHair);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mBrownRightHair);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 100f, mPaint);

         mPaint.setColor(mRedEar);
         mCanvas.drawCircle(halfWidth - 400f, halfHeight - 100f, 60f, mPaint);
         mCanvas.drawCircle(halfWidth + 400f, halfHeight - 100f, 60f, mPaint);

         RectF face = new RectF(left, top, right, bottom);

         mPaint.setColor(mYellowLeftFace);
         mCanvas.drawArc(face, 90f, 180f, false, mPaint);

         mPaint.setColor(mYellowRightFace);
         mCanvas.drawArc(face, 270f, 180f, false, mPaint);

         mPaint.setColor(mColorBlackEyes);
         mCanvas.drawCircle(halfWidth - 100F, halfHeight - 10F, 50F, mPaint);
         mCanvas.drawCircle(halfWidth + 100F, halfHeight - 10F, 50F, mPaint);

         mPaint.setColor(mColorWhiteEyes);
         mCanvas.drawCircle(halfWidth - 120F, halfHeight - 20F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 80F, halfHeight - 20F, 15F, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
         RectF lip = new RectF(halfWidth - 200F, halfHeight - 100F, halfWidth + 200F, halfHeight + 400F);
         mCanvas.drawArc(lip, 25F, 130F, false, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.white, null));
         RectF mouth = new RectF(halfWidth - 180F, halfHeight, halfWidth + 180F, halfHeight + 380F);
         mCanvas.drawArc(mouth, 25F, 130F, false, mPaint);

         mPaint.setColor( ResourcesCompat.getColor(getResources(), R.color.black, null));
         mCanvas.drawCircle(halfWidth - 40F, halfHeight + 140F, 15F, mPaint);
         mCanvas.drawCircle(halfWidth + 40F, halfHeight + 140F, 15F, mPaint);

         Path path = new Path();
         path.addCircle(halfWidth - 100F,halfHeight - 10F, 150F, Path.Direction.CCW);
         path.addCircle(halfWidth + 100F,halfHeight - 10F, 150F, Path.Direction.CCW);

         RectF mouth2 = new RectF(halfWidth - 250F, halfHeight, halfWidth + 250F, halfHeight + 500F);
         path.addOval(mouth2, Path.Direction.CCW);

         if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            mCanvas.clipPath(path, Region.Op.DIFFERENCE);
         } else {
            mCanvas.clipOutPath(path);
         }

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.brown_left_hair, null));
         mCanvas.drawArc(face, 90F, 180F, false, mPaint);

         mPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.brown_right_hair, null));
         mCanvas.drawArc(face, 270F, 180F, false, mPaint);
      } else {
         count = 1;
      }

   }
}