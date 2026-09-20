.class public final Ln21;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln21;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p2, p0, Ln21;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static a(III)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/high16 v1, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-ne p0, v1, :cond_2

    .line 22
    .line 23
    const/high16 p0, -0x80000000

    .line 24
    .line 25
    if-eq v0, p0, :cond_1

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    :cond_1
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    return p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final b(Lg31;Lm60;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_10

    .line 10
    .line 11
    :cond_0
    iget-object v3, v1, Lg31;->J:Lh21;

    .line 12
    .line 13
    iget-object v4, v1, Lg31;->H:Lh21;

    .line 14
    .line 15
    iget v5, v1, Lg31;->f0:I

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    if-ne v5, v6, :cond_1

    .line 21
    .line 22
    iput v7, v2, Lm60;->e:I

    .line 23
    .line 24
    iput v7, v2, Lm60;->f:I

    .line 25
    .line 26
    iput v7, v2, Lm60;->g:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v5, v1, Lg31;->S:Lg31;

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    goto/16 :goto_10

    .line 34
    .line 35
    :cond_2
    iget v5, v2, Lm60;->a:I

    .line 36
    .line 37
    iget v6, v2, Lm60;->b:I

    .line 38
    .line 39
    iget v8, v2, Lm60;->c:I

    .line 40
    .line 41
    iget v9, v2, Lm60;->d:I

    .line 42
    .line 43
    iget v10, v0, Ln21;->b:I

    .line 44
    .line 45
    iget v11, v0, Ln21;->c:I

    .line 46
    .line 47
    add-int/2addr v10, v11

    .line 48
    iget v11, v0, Ln21;->d:I

    .line 49
    .line 50
    iget-object v12, v1, Lg31;->e0:Landroid/view/View;

    .line 51
    .line 52
    invoke-static {v5}, Lb81;->B(I)I

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    const/4 v14, 0x1

    .line 57
    const/4 v15, 0x3

    .line 58
    const/4 v7, 0x2

    .line 59
    if-eqz v13, :cond_d

    .line 60
    .line 61
    if-eq v13, v14, :cond_c

    .line 62
    .line 63
    if-eq v13, v7, :cond_6

    .line 64
    .line 65
    if-eq v13, v15, :cond_3

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget v8, v0, Ln21;->f:I

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    iget v13, v4, Lh21;->g:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/4 v13, 0x0

    .line 77
    :goto_0
    if-eqz v3, :cond_5

    .line 78
    .line 79
    iget v15, v3, Lh21;->g:I

    .line 80
    .line 81
    add-int/2addr v13, v15

    .line 82
    :cond_5
    add-int/2addr v11, v13

    .line 83
    const/4 v13, -0x1

    .line 84
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    goto :goto_3

    .line 89
    :cond_6
    iget v8, v0, Ln21;->f:I

    .line 90
    .line 91
    const/4 v13, -0x2

    .line 92
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    iget v11, v1, Lg31;->q:I

    .line 97
    .line 98
    if-ne v11, v14, :cond_7

    .line 99
    .line 100
    move v11, v14

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    const/4 v11, 0x0

    .line 103
    :goto_1
    iget v13, v2, Lm60;->j:I

    .line 104
    .line 105
    if-eq v13, v14, :cond_8

    .line 106
    .line 107
    if-ne v13, v7, :cond_e

    .line 108
    .line 109
    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    invoke-virtual {v1}, Lg31;->k()I

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-ne v13, v15, :cond_9

    .line 118
    .line 119
    move v13, v14

    .line 120
    goto :goto_2

    .line 121
    :cond_9
    const/4 v13, 0x0

    .line 122
    :goto_2
    iget v15, v2, Lm60;->j:I

    .line 123
    .line 124
    if-eq v15, v7, :cond_b

    .line 125
    .line 126
    if-eqz v11, :cond_b

    .line 127
    .line 128
    if-eqz v11, :cond_a

    .line 129
    .line 130
    if-nez v13, :cond_b

    .line 131
    .line 132
    :cond_a
    invoke-virtual {v1}, Lg31;->x()Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_e

    .line 137
    .line 138
    :cond_b
    invoke-virtual {v1}, Lg31;->n()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    const/high16 v13, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    goto :goto_3

    .line 149
    :cond_c
    const/high16 v13, 0x40000000    # 2.0f

    .line 150
    .line 151
    iget v8, v0, Ln21;->f:I

    .line 152
    .line 153
    const/4 v15, -0x2

    .line 154
    invoke-static {v8, v11, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    goto :goto_3

    .line 159
    :cond_d
    const/high16 v13, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    :cond_e
    :goto_3
    invoke-static {v6}, Lb81;->B(I)I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_19

    .line 170
    .line 171
    if-eq v11, v14, :cond_18

    .line 172
    .line 173
    if-eq v11, v7, :cond_12

    .line 174
    .line 175
    const/4 v9, 0x3

    .line 176
    if-eq v11, v9, :cond_f

    .line 177
    .line 178
    const/4 v3, 0x0

    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :cond_f
    iget v9, v0, Ln21;->g:I

    .line 182
    .line 183
    if-eqz v4, :cond_10

    .line 184
    .line 185
    iget-object v4, v1, Lg31;->I:Lh21;

    .line 186
    .line 187
    iget v4, v4, Lh21;->g:I

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_10
    const/4 v4, 0x0

    .line 191
    :goto_4
    if-eqz v3, :cond_11

    .line 192
    .line 193
    iget-object v3, v1, Lg31;->K:Lh21;

    .line 194
    .line 195
    iget v3, v3, Lh21;->g:I

    .line 196
    .line 197
    add-int/2addr v4, v3

    .line 198
    :cond_11
    add-int/2addr v10, v4

    .line 199
    const/4 v13, -0x1

    .line 200
    invoke-static {v9, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    goto :goto_7

    .line 205
    :cond_12
    iget v3, v0, Ln21;->g:I

    .line 206
    .line 207
    const/4 v13, -0x2

    .line 208
    invoke-static {v3, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    iget v4, v1, Lg31;->r:I

    .line 213
    .line 214
    if-ne v4, v14, :cond_13

    .line 215
    .line 216
    move v4, v14

    .line 217
    goto :goto_5

    .line 218
    :cond_13
    const/4 v4, 0x0

    .line 219
    :goto_5
    iget v9, v2, Lm60;->j:I

    .line 220
    .line 221
    if-eq v9, v14, :cond_14

    .line 222
    .line 223
    if-ne v9, v7, :cond_1a

    .line 224
    .line 225
    :cond_14
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-virtual {v1}, Lg31;->n()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-ne v9, v10, :cond_15

    .line 234
    .line 235
    move v9, v14

    .line 236
    goto :goto_6

    .line 237
    :cond_15
    const/4 v9, 0x0

    .line 238
    :goto_6
    iget v10, v2, Lm60;->j:I

    .line 239
    .line 240
    if-eq v10, v7, :cond_17

    .line 241
    .line 242
    if-eqz v4, :cond_17

    .line 243
    .line 244
    if-eqz v4, :cond_16

    .line 245
    .line 246
    if-nez v9, :cond_17

    .line 247
    .line 248
    :cond_16
    invoke-virtual {v1}, Lg31;->y()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_1a

    .line 253
    .line 254
    :cond_17
    invoke-virtual {v1}, Lg31;->k()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    const/high16 v13, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-static {v3, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    goto :goto_7

    .line 265
    :cond_18
    const/high16 v13, 0x40000000    # 2.0f

    .line 266
    .line 267
    iget v3, v0, Ln21;->g:I

    .line 268
    .line 269
    const/4 v15, -0x2

    .line 270
    invoke-static {v3, v10, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    goto :goto_7

    .line 275
    :cond_19
    const/high16 v13, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    :cond_1a
    :goto_7
    iget-object v4, v1, Lg31;->S:Lg31;

    .line 282
    .line 283
    check-cast v4, Lh31;

    .line 284
    .line 285
    iget-object v0, v0, Ln21;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 286
    .line 287
    if-eqz v4, :cond_1b

    .line 288
    .line 289
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->E:I

    .line 290
    .line 291
    const/16 v10, 0x100

    .line 292
    .line 293
    invoke-static {v9, v10}, Lrc9;->I(II)Z

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    if-eqz v9, :cond_1b

    .line 298
    .line 299
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    invoke-virtual {v1}, Lg31;->n()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    if-ne v9, v10, :cond_1b

    .line 308
    .line 309
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    invoke-virtual {v4}, Lg31;->n()I

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    if-ge v9, v10, :cond_1b

    .line 318
    .line 319
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    invoke-virtual {v1}, Lg31;->k()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-ne v9, v10, :cond_1b

    .line 328
    .line 329
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    invoke-virtual {v4}, Lg31;->k()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    if-ge v9, v4, :cond_1b

    .line 338
    .line 339
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    iget v9, v1, Lg31;->Z:I

    .line 344
    .line 345
    if-ne v4, v9, :cond_1b

    .line 346
    .line 347
    invoke-virtual {v1}, Lg31;->w()Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    if-nez v4, :cond_1b

    .line 352
    .line 353
    iget v4, v1, Lg31;->F:I

    .line 354
    .line 355
    invoke-virtual {v1}, Lg31;->n()I

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    invoke-static {v4, v8, v9}, Ln21;->a(III)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_1b

    .line 364
    .line 365
    iget v4, v1, Lg31;->G:I

    .line 366
    .line 367
    invoke-virtual {v1}, Lg31;->k()I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    invoke-static {v4, v3, v9}, Ln21;->a(III)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_1b

    .line 376
    .line 377
    invoke-virtual {v1}, Lg31;->n()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    iput v0, v2, Lm60;->e:I

    .line 382
    .line 383
    invoke-virtual {v1}, Lg31;->k()I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    iput v0, v2, Lm60;->f:I

    .line 388
    .line 389
    iget v0, v1, Lg31;->Z:I

    .line 390
    .line 391
    iput v0, v2, Lm60;->g:I

    .line 392
    .line 393
    return-void

    .line 394
    :cond_1b
    const/4 v9, 0x3

    .line 395
    if-ne v5, v9, :cond_1c

    .line 396
    .line 397
    move v4, v14

    .line 398
    goto :goto_8

    .line 399
    :cond_1c
    const/4 v4, 0x0

    .line 400
    :goto_8
    if-ne v6, v9, :cond_1d

    .line 401
    .line 402
    move v9, v14

    .line 403
    goto :goto_9

    .line 404
    :cond_1d
    const/4 v9, 0x0

    .line 405
    :goto_9
    const/4 v10, 0x4

    .line 406
    if-eq v6, v10, :cond_1f

    .line 407
    .line 408
    if-ne v6, v14, :cond_1e

    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_1e
    const/4 v6, 0x0

    .line 412
    goto :goto_b

    .line 413
    :cond_1f
    :goto_a
    move v6, v14

    .line 414
    :goto_b
    if-eq v5, v10, :cond_21

    .line 415
    .line 416
    if-ne v5, v14, :cond_20

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :cond_20
    const/4 v5, 0x0

    .line 420
    goto :goto_d

    .line 421
    :cond_21
    :goto_c
    move v5, v14

    .line 422
    :goto_d
    const/4 v10, 0x0

    .line 423
    if-eqz v4, :cond_22

    .line 424
    .line 425
    iget v11, v1, Lg31;->V:F

    .line 426
    .line 427
    cmpl-float v11, v11, v10

    .line 428
    .line 429
    if-lez v11, :cond_22

    .line 430
    .line 431
    move v11, v14

    .line 432
    goto :goto_e

    .line 433
    :cond_22
    const/4 v11, 0x0

    .line 434
    :goto_e
    if-eqz v9, :cond_23

    .line 435
    .line 436
    iget v13, v1, Lg31;->V:F

    .line 437
    .line 438
    cmpl-float v10, v13, v10

    .line 439
    .line 440
    if-lez v10, :cond_23

    .line 441
    .line 442
    move v10, v14

    .line 443
    goto :goto_f

    .line 444
    :cond_23
    const/4 v10, 0x0

    .line 445
    :goto_f
    if-nez v12, :cond_24

    .line 446
    .line 447
    :goto_10
    return-void

    .line 448
    :cond_24
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    check-cast v13, Lm21;

    .line 453
    .line 454
    iget v15, v2, Lm60;->j:I

    .line 455
    .line 456
    if-eq v15, v14, :cond_26

    .line 457
    .line 458
    if-eq v15, v7, :cond_26

    .line 459
    .line 460
    if-eqz v4, :cond_26

    .line 461
    .line 462
    iget v4, v1, Lg31;->q:I

    .line 463
    .line 464
    if-nez v4, :cond_26

    .line 465
    .line 466
    if-eqz v9, :cond_26

    .line 467
    .line 468
    iget v4, v1, Lg31;->r:I

    .line 469
    .line 470
    if-eqz v4, :cond_25

    .line 471
    .line 472
    goto :goto_11

    .line 473
    :cond_25
    const/4 v0, -0x1

    .line 474
    const/4 v4, 0x0

    .line 475
    const/4 v5, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v15, 0x0

    .line 478
    goto/16 :goto_19

    .line 479
    .line 480
    :cond_26
    :goto_11
    instance-of v4, v12, Lw68;

    .line 481
    .line 482
    if-eqz v4, :cond_27

    .line 483
    .line 484
    instance-of v4, v1, Lei2;

    .line 485
    .line 486
    if-eqz v4, :cond_27

    .line 487
    .line 488
    move-object v4, v1

    .line 489
    check-cast v4, Lei2;

    .line 490
    .line 491
    move-object v7, v12

    .line 492
    check-cast v7, Lw68;

    .line 493
    .line 494
    invoke-virtual {v7, v4, v8, v3}, Lw68;->j(Lei2;II)V

    .line 495
    .line 496
    .line 497
    goto :goto_12

    .line 498
    :cond_27
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 499
    .line 500
    .line 501
    :goto_12
    iput v8, v1, Lg31;->F:I

    .line 502
    .line 503
    iput v3, v1, Lg31;->G:I

    .line 504
    .line 505
    const/4 v4, 0x0

    .line 506
    iput-boolean v4, v1, Lg31;->g:Z

    .line 507
    .line 508
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 517
    .line 518
    .line 519
    move-result v9

    .line 520
    iget v15, v1, Lg31;->t:I

    .line 521
    .line 522
    if-lez v15, :cond_28

    .line 523
    .line 524
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 525
    .line 526
    .line 527
    move-result v15

    .line 528
    goto :goto_13

    .line 529
    :cond_28
    move v15, v4

    .line 530
    :goto_13
    iget v14, v1, Lg31;->u:I

    .line 531
    .line 532
    if-lez v14, :cond_29

    .line 533
    .line 534
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 535
    .line 536
    .line 537
    move-result v15

    .line 538
    :cond_29
    iget v14, v1, Lg31;->w:I

    .line 539
    .line 540
    if-lez v14, :cond_2a

    .line 541
    .line 542
    invoke-static {v14, v7}, Ljava/lang/Math;->max(II)I

    .line 543
    .line 544
    .line 545
    move-result v14

    .line 546
    :goto_14
    move/from16 v16, v3

    .line 547
    .line 548
    goto :goto_15

    .line 549
    :cond_2a
    move v14, v7

    .line 550
    goto :goto_14

    .line 551
    :goto_15
    iget v3, v1, Lg31;->x:I

    .line 552
    .line 553
    if-lez v3, :cond_2b

    .line 554
    .line 555
    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    .line 556
    .line 557
    .line 558
    move-result v14

    .line 559
    :cond_2b
    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->E:I

    .line 560
    .line 561
    const/4 v3, 0x1

    .line 562
    invoke-static {v0, v3}, Lrc9;->I(II)Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    if-nez v0, :cond_2d

    .line 567
    .line 568
    const/high16 v0, 0x3f000000    # 0.5f

    .line 569
    .line 570
    if-eqz v11, :cond_2c

    .line 571
    .line 572
    if-eqz v6, :cond_2c

    .line 573
    .line 574
    iget v3, v1, Lg31;->V:F

    .line 575
    .line 576
    int-to-float v5, v14

    .line 577
    mul-float/2addr v5, v3

    .line 578
    add-float/2addr v5, v0

    .line 579
    float-to-int v0, v5

    .line 580
    move v15, v0

    .line 581
    goto :goto_16

    .line 582
    :cond_2c
    if-eqz v10, :cond_2d

    .line 583
    .line 584
    if-eqz v5, :cond_2d

    .line 585
    .line 586
    iget v3, v1, Lg31;->V:F

    .line 587
    .line 588
    int-to-float v5, v15

    .line 589
    div-float/2addr v5, v3

    .line 590
    add-float/2addr v5, v0

    .line 591
    float-to-int v0, v5

    .line 592
    move v14, v0

    .line 593
    :cond_2d
    :goto_16
    if-ne v4, v15, :cond_2f

    .line 594
    .line 595
    if-eq v7, v14, :cond_2e

    .line 596
    .line 597
    goto :goto_17

    .line 598
    :cond_2e
    move v5, v9

    .line 599
    const/4 v0, -0x1

    .line 600
    const/4 v4, 0x0

    .line 601
    goto :goto_19

    .line 602
    :cond_2f
    :goto_17
    const/high16 v0, 0x40000000    # 2.0f

    .line 603
    .line 604
    if-eq v4, v15, :cond_30

    .line 605
    .line 606
    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 607
    .line 608
    .line 609
    move-result v8

    .line 610
    :cond_30
    if-eq v7, v14, :cond_31

    .line 611
    .line 612
    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    goto :goto_18

    .line 617
    :cond_31
    move/from16 v3, v16

    .line 618
    .line 619
    :goto_18
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 620
    .line 621
    .line 622
    iput v8, v1, Lg31;->F:I

    .line 623
    .line 624
    iput v3, v1, Lg31;->G:I

    .line 625
    .line 626
    const/4 v4, 0x0

    .line 627
    iput-boolean v4, v1, Lg31;->g:Z

    .line 628
    .line 629
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 638
    .line 639
    .line 640
    move-result v5

    .line 641
    move v15, v0

    .line 642
    move v14, v3

    .line 643
    const/4 v0, -0x1

    .line 644
    :goto_19
    if-eq v5, v0, :cond_32

    .line 645
    .line 646
    const/4 v0, 0x1

    .line 647
    goto :goto_1a

    .line 648
    :cond_32
    move v0, v4

    .line 649
    :goto_1a
    iget v3, v2, Lm60;->c:I

    .line 650
    .line 651
    if-ne v15, v3, :cond_34

    .line 652
    .line 653
    iget v3, v2, Lm60;->d:I

    .line 654
    .line 655
    if-eq v14, v3, :cond_33

    .line 656
    .line 657
    goto :goto_1b

    .line 658
    :cond_33
    move v7, v4

    .line 659
    goto :goto_1c

    .line 660
    :cond_34
    :goto_1b
    const/4 v7, 0x1

    .line 661
    :goto_1c
    iput-boolean v7, v2, Lm60;->i:Z

    .line 662
    .line 663
    iget-boolean v3, v13, Lm21;->b0:Z

    .line 664
    .line 665
    if-eqz v3, :cond_35

    .line 666
    .line 667
    const/4 v3, 0x1

    .line 668
    goto :goto_1d

    .line 669
    :cond_35
    move v3, v0

    .line 670
    :goto_1d
    if-eqz v3, :cond_36

    .line 671
    .line 672
    const/4 v13, -0x1

    .line 673
    if-eq v5, v13, :cond_36

    .line 674
    .line 675
    iget v0, v1, Lg31;->Z:I

    .line 676
    .line 677
    if-eq v0, v5, :cond_36

    .line 678
    .line 679
    const/4 v0, 0x1

    .line 680
    iput-boolean v0, v2, Lm60;->i:Z

    .line 681
    .line 682
    :cond_36
    iput v15, v2, Lm60;->e:I

    .line 683
    .line 684
    iput v14, v2, Lm60;->f:I

    .line 685
    .line 686
    iput-boolean v3, v2, Lm60;->h:Z

    .line 687
    .line 688
    iput v5, v2, Lm60;->g:I

    .line 689
    .line 690
    return-void
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method
