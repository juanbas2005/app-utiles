.class public final Lrm0;
.super Lio5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrm0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final a(Lvu6;Lvu6;)F
    .locals 6

    .line 1
    iget p0, p0, Lrm0;->a:I

    .line 2
    .line 3
    const-wide v0, 0x3ff199999999999aL    # 1.1

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/high16 v3, 0x3f800000    # 1.0f

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget p0, p1, Lvu6;->w:I

    .line 15
    .line 16
    iget p1, p1, Lvu6;->x:I

    .line 17
    .line 18
    if-lez p0, :cond_4

    .line 19
    .line 20
    if-gtz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    int-to-float v0, p0

    .line 24
    mul-float/2addr v0, v3

    .line 25
    iget v1, p2, Lvu6;->w:I

    .line 26
    .line 27
    iget p2, p2, Lvu6;->x:I

    .line 28
    .line 29
    int-to-float v2, v1

    .line 30
    div-float/2addr v0, v2

    .line 31
    cmpg-float v2, v0, v3

    .line 32
    .line 33
    if-gez v2, :cond_1

    .line 34
    .line 35
    div-float v0, v3, v0

    .line 36
    .line 37
    :cond_1
    int-to-float p1, p1

    .line 38
    mul-float v2, p1, v3

    .line 39
    .line 40
    int-to-float p2, p2

    .line 41
    div-float/2addr v2, p2

    .line 42
    cmpg-float v4, v2, v3

    .line 43
    .line 44
    if-gez v4, :cond_2

    .line 45
    .line 46
    div-float v2, v3, v2

    .line 47
    .line 48
    :cond_2
    div-float v0, v3, v0

    .line 49
    .line 50
    div-float/2addr v0, v2

    .line 51
    int-to-float p0, p0

    .line 52
    mul-float/2addr p0, v3

    .line 53
    div-float/2addr p0, p1

    .line 54
    int-to-float p1, v1

    .line 55
    mul-float/2addr p1, v3

    .line 56
    div-float/2addr p1, p2

    .line 57
    div-float/2addr p0, p1

    .line 58
    cmpg-float p1, p0, v3

    .line 59
    .line 60
    if-gez p1, :cond_3

    .line 61
    .line 62
    div-float p0, v3, p0

    .line 63
    .line 64
    :cond_3
    div-float/2addr v3, p0

    .line 65
    div-float/2addr v3, p0

    .line 66
    div-float/2addr v3, p0

    .line 67
    mul-float v2, v3, v0

    .line 68
    .line 69
    :cond_4
    :goto_0
    return v2

    .line 70
    :pswitch_0
    iget p0, p1, Lvu6;->w:I

    .line 71
    .line 72
    if-lez p0, :cond_7

    .line 73
    .line 74
    iget p0, p1, Lvu6;->x:I

    .line 75
    .line 76
    if-gtz p0, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-virtual {p1, p2}, Lvu6;->b(Lvu6;)Lvu6;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget v2, p0, Lvu6;->w:I

    .line 84
    .line 85
    int-to-float v2, v2

    .line 86
    mul-float v4, v2, v3

    .line 87
    .line 88
    iget p1, p1, Lvu6;->w:I

    .line 89
    .line 90
    int-to-float p1, p1

    .line 91
    div-float/2addr v4, p1

    .line 92
    cmpl-float p1, v4, v3

    .line 93
    .line 94
    if-lez p1, :cond_6

    .line 95
    .line 96
    div-float p1, v3, v4

    .line 97
    .line 98
    float-to-double v4, p1

    .line 99
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    double-to-float v4, v0

    .line 104
    :cond_6
    iget p1, p2, Lvu6;->w:I

    .line 105
    .line 106
    int-to-float p1, p1

    .line 107
    mul-float/2addr p1, v3

    .line 108
    div-float/2addr p1, v2

    .line 109
    iget p2, p2, Lvu6;->x:I

    .line 110
    .line 111
    int-to-float p2, p2

    .line 112
    mul-float/2addr p2, v3

    .line 113
    iget p0, p0, Lvu6;->x:I

    .line 114
    .line 115
    int-to-float p0, p0

    .line 116
    div-float/2addr p2, p0

    .line 117
    mul-float/2addr p2, p1

    .line 118
    div-float/2addr v3, p2

    .line 119
    div-float/2addr v3, p2

    .line 120
    div-float/2addr v3, p2

    .line 121
    mul-float v2, v3, v4

    .line 122
    .line 123
    :cond_7
    :goto_1
    return v2

    .line 124
    :pswitch_1
    iget p0, p1, Lvu6;->w:I

    .line 125
    .line 126
    if-lez p0, :cond_a

    .line 127
    .line 128
    iget p0, p1, Lvu6;->x:I

    .line 129
    .line 130
    if-gtz p0, :cond_8

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_8
    invoke-virtual {p1, p2}, Lvu6;->a(Lvu6;)Lvu6;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget v2, p0, Lvu6;->w:I

    .line 138
    .line 139
    int-to-float v2, v2

    .line 140
    mul-float/2addr v2, v3

    .line 141
    iget p1, p1, Lvu6;->w:I

    .line 142
    .line 143
    int-to-float p1, p1

    .line 144
    div-float p1, v2, p1

    .line 145
    .line 146
    cmpl-float v4, p1, v3

    .line 147
    .line 148
    if-lez v4, :cond_9

    .line 149
    .line 150
    div-float p1, v3, p1

    .line 151
    .line 152
    float-to-double v4, p1

    .line 153
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 154
    .line 155
    .line 156
    move-result-wide v0

    .line 157
    double-to-float p1, v0

    .line 158
    :cond_9
    iget v0, p2, Lvu6;->w:I

    .line 159
    .line 160
    int-to-float v0, v0

    .line 161
    div-float/2addr v2, v0

    .line 162
    iget p0, p0, Lvu6;->x:I

    .line 163
    .line 164
    int-to-float p0, p0

    .line 165
    mul-float/2addr p0, v3

    .line 166
    iget p2, p2, Lvu6;->x:I

    .line 167
    .line 168
    int-to-float p2, p2

    .line 169
    div-float/2addr p0, p2

    .line 170
    add-float/2addr p0, v2

    .line 171
    div-float/2addr v3, p0

    .line 172
    div-float/2addr v3, p0

    .line 173
    mul-float v2, v3, p1

    .line 174
    .line 175
    :cond_a
    :goto_2
    return v2

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final b(Lvu6;Lvu6;)Landroid/graphics/Rect;
    .locals 5

    .line 1
    iget p0, p0, Lrm0;->a:I

    .line 2
    .line 3
    const-string v0, "; Want: "

    .line 4
    .line 5
    const-string v1, "; Scaled: "

    .line 6
    .line 7
    const-string v2, "Preview: "

    .line 8
    .line 9
    const-string v3, "rm0"

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p0, Landroid/graphics/Rect;

    .line 15
    .line 16
    iget p1, p2, Lvu6;->w:I

    .line 17
    .line 18
    iget p2, p2, Lvu6;->x:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0, v0, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-virtual {p1, p2}, Lvu6;->b(Lvu6;)Lvu6;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v4, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    iget p1, p0, Lvu6;->w:I

    .line 57
    .line 58
    iget v0, p2, Lvu6;->w:I

    .line 59
    .line 60
    sub-int v0, p1, v0

    .line 61
    .line 62
    div-int/lit8 v0, v0, 0x2

    .line 63
    .line 64
    iget p0, p0, Lvu6;->x:I

    .line 65
    .line 66
    iget p2, p2, Lvu6;->x:I

    .line 67
    .line 68
    sub-int p2, p0, p2

    .line 69
    .line 70
    div-int/lit8 p2, p2, 0x2

    .line 71
    .line 72
    new-instance v1, Landroid/graphics/Rect;

    .line 73
    .line 74
    neg-int v2, v0

    .line 75
    neg-int v3, p2

    .line 76
    sub-int/2addr p1, v0

    .line 77
    sub-int/2addr p0, p2

    .line 78
    invoke-direct {v1, v2, v3, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_1
    invoke-virtual {p1, p2}, Lvu6;->a(Lvu6;)Lvu6;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    iget p1, p0, Lvu6;->w:I

    .line 114
    .line 115
    iget v0, p2, Lvu6;->w:I

    .line 116
    .line 117
    sub-int v0, p1, v0

    .line 118
    .line 119
    div-int/lit8 v0, v0, 0x2

    .line 120
    .line 121
    iget p0, p0, Lvu6;->x:I

    .line 122
    .line 123
    iget p2, p2, Lvu6;->x:I

    .line 124
    .line 125
    sub-int p2, p0, p2

    .line 126
    .line 127
    div-int/lit8 p2, p2, 0x2

    .line 128
    .line 129
    new-instance v1, Landroid/graphics/Rect;

    .line 130
    .line 131
    neg-int v2, v0

    .line 132
    neg-int v3, p2

    .line 133
    sub-int/2addr p1, v0

    .line 134
    sub-int/2addr p0, p2

    .line 135
    invoke-direct {v1, v2, v3, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
