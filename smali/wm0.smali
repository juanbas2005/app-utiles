.class public final Lwm0;
.super Landroid/util/Property;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lwm0;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

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
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lwm0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    sget-object p0, Ln68;->a:Lt68;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lza5;->s(Landroid/view/View;)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_4
    check-cast p1, Lzm0;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_5
    check-cast p1, Lzm0;

    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget p0, p0, Lwm0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    check-cast p2, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Float;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sget-object p2, Ln68;->a:Lt68;

    .line 24
    .line 25
    invoke-virtual {p2, p1, p0}, Lza5;->C(Landroid/view/View;F)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 30
    .line 31
    check-cast p2, Landroid/graphics/PointF;

    .line 32
    .line 33
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    add-int/2addr v0, p0

    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v1, p2

    .line 55
    invoke-static {p1, p0, p2, v0, v1}, Ln68;->a(Landroid/view/View;IIII)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 60
    .line 61
    check-cast p2, Landroid/graphics/PointF;

    .line 62
    .line 63
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {p1, p0, p2, v0, v1}, Ln68;->a(Landroid/view/View;IIII)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 88
    .line 89
    check-cast p2, Landroid/graphics/PointF;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 100
    .line 101
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 106
    .line 107
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-static {p1, p0, v0, v1, p2}, Ln68;->a(Landroid/view/View;IIII)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_4
    check-cast p1, Lzm0;

    .line 116
    .line 117
    check-cast p2, Landroid/graphics/PointF;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 123
    .line 124
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, p1, Lzm0;->c:I

    .line 129
    .line 130
    iget p0, p2, Landroid/graphics/PointF;->y:F

    .line 131
    .line 132
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    iput p0, p1, Lzm0;->d:I

    .line 137
    .line 138
    iget p2, p1, Lzm0;->g:I

    .line 139
    .line 140
    add-int/lit8 p2, p2, 0x1

    .line 141
    .line 142
    iput p2, p1, Lzm0;->g:I

    .line 143
    .line 144
    iget v1, p1, Lzm0;->f:I

    .line 145
    .line 146
    if-ne v1, p2, :cond_0

    .line 147
    .line 148
    iget-object p2, p1, Lzm0;->e:Landroid/view/View;

    .line 149
    .line 150
    iget v1, p1, Lzm0;->a:I

    .line 151
    .line 152
    iget v2, p1, Lzm0;->b:I

    .line 153
    .line 154
    iget v3, p1, Lzm0;->c:I

    .line 155
    .line 156
    invoke-static {p2, v1, v2, v3, p0}, Ln68;->a(Landroid/view/View;IIII)V

    .line 157
    .line 158
    .line 159
    iput v0, p1, Lzm0;->f:I

    .line 160
    .line 161
    iput v0, p1, Lzm0;->g:I

    .line 162
    .line 163
    :cond_0
    return-void

    .line 164
    :pswitch_5
    check-cast p1, Lzm0;

    .line 165
    .line 166
    check-cast p2, Landroid/graphics/PointF;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 172
    .line 173
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    iput p0, p1, Lzm0;->a:I

    .line 178
    .line 179
    iget p0, p2, Landroid/graphics/PointF;->y:F

    .line 180
    .line 181
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    iput p0, p1, Lzm0;->b:I

    .line 186
    .line 187
    iget p2, p1, Lzm0;->f:I

    .line 188
    .line 189
    add-int/lit8 p2, p2, 0x1

    .line 190
    .line 191
    iput p2, p1, Lzm0;->f:I

    .line 192
    .line 193
    iget v1, p1, Lzm0;->g:I

    .line 194
    .line 195
    if-ne p2, v1, :cond_1

    .line 196
    .line 197
    iget-object p2, p1, Lzm0;->e:Landroid/view/View;

    .line 198
    .line 199
    iget v1, p1, Lzm0;->a:I

    .line 200
    .line 201
    iget v2, p1, Lzm0;->c:I

    .line 202
    .line 203
    iget v3, p1, Lzm0;->d:I

    .line 204
    .line 205
    invoke-static {p2, v1, p0, v2, v3}, Ln68;->a(Landroid/view/View;IIII)V

    .line 206
    .line 207
    .line 208
    iput v0, p1, Lzm0;->f:I

    .line 209
    .line 210
    iput v0, p1, Lzm0;->g:I

    .line 211
    .line 212
    :cond_1
    return-void

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
