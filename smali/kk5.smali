.class public final Lkk5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lhv2;

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lhv2;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkk5;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lkk5;->b:Lhv2;

    .line 7
    .line 8
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    if-lt p2, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lkk5;->a()Landroid/view/MotionEvent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v2}, Lix2;->u(Landroid/view/MotionEvent;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v0

    .line 27
    :goto_0
    iput v2, p0, Lkk5;->c:I

    .line 28
    .line 29
    invoke-virtual {p0}, Lkk5;->a()Landroid/view/MotionEvent;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v2, v0

    .line 41
    :goto_1
    iput v2, p0, Lkk5;->d:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lkk5;->a()Landroid/view/MotionEvent;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getMetaState()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v2, v0

    .line 55
    :goto_2
    iput v2, p0, Lkk5;->e:I

    .line 56
    .line 57
    invoke-virtual {p0}, Lkk5;->a()Landroid/view/MotionEvent;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/4 v3, 0x3

    .line 62
    const/4 v4, 0x2

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eqz v2, :cond_10

    .line 65
    .line 66
    if-lt p2, v1, :cond_3

    .line 67
    .line 68
    invoke-static {v2}, Lix2;->u(Landroid/view/MotionEvent;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-ne p1, v3, :cond_3

    .line 73
    .line 74
    move p1, v5

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move p1, v0

    .line 77
    :goto_3
    const/4 v6, 0x5

    .line 78
    if-lt p2, v1, :cond_4

    .line 79
    .line 80
    invoke-static {v2}, Lix2;->u(Landroid/view/MotionEvent;)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-ne p2, v6, :cond_4

    .line 85
    .line 86
    move p2, v5

    .line 87
    goto :goto_4

    .line 88
    :cond_4
    move p2, v0

    .line 89
    :goto_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/16 v2, 0xa

    .line 94
    .line 95
    if-eqz v1, :cond_e

    .line 96
    .line 97
    const/16 v7, 0xc

    .line 98
    .line 99
    if-eq v1, v5, :cond_c

    .line 100
    .line 101
    const/16 v8, 0x8

    .line 102
    .line 103
    if-eq v1, v4, :cond_9

    .line 104
    .line 105
    packed-switch v1, :pswitch_data_0

    .line 106
    .line 107
    .line 108
    goto/16 :goto_b

    .line 109
    .line 110
    :pswitch_0
    move v0, v6

    .line 111
    goto/16 :goto_b

    .line 112
    .line 113
    :pswitch_1
    const/4 v0, 0x4

    .line 114
    goto/16 :goto_b

    .line 115
    .line 116
    :pswitch_2
    const/4 v0, 0x6

    .line 117
    goto/16 :goto_b

    .line 118
    .line 119
    :pswitch_3
    if-eqz p1, :cond_5

    .line 120
    .line 121
    :goto_5
    move v0, v7

    .line 122
    goto :goto_b

    .line 123
    :cond_5
    if-eqz p2, :cond_6

    .line 124
    .line 125
    :goto_6
    move v0, v8

    .line 126
    goto :goto_b

    .line 127
    :cond_6
    :goto_7
    move v0, v4

    .line 128
    goto :goto_b

    .line 129
    :pswitch_4
    if-eqz p1, :cond_7

    .line 130
    .line 131
    :goto_8
    move v0, v2

    .line 132
    goto :goto_b

    .line 133
    :cond_7
    if-eqz p2, :cond_8

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_8
    :goto_9
    move v0, v5

    .line 137
    goto :goto_b

    .line 138
    :cond_9
    :pswitch_5
    if-eqz p1, :cond_a

    .line 139
    .line 140
    const/16 v0, 0xb

    .line 141
    .line 142
    goto :goto_b

    .line 143
    :cond_a
    if-eqz p2, :cond_b

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_b
    move v0, v3

    .line 147
    goto :goto_b

    .line 148
    :cond_c
    if-eqz p1, :cond_d

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_d
    if-eqz p2, :cond_6

    .line 152
    .line 153
    const/16 v0, 0x9

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_e
    if-eqz p1, :cond_f

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_f
    if-eqz p2, :cond_8

    .line 160
    .line 161
    const/4 v0, 0x7

    .line 162
    goto :goto_b

    .line 163
    :cond_10
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    :goto_a
    if-ge v0, p2, :cond_b

    .line 168
    .line 169
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Lqk5;

    .line 174
    .line 175
    invoke-static {v1}, Lub5;->d(Lqk5;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_11

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_11
    invoke-static {v1}, Lub5;->b(Lqk5;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_12

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_12
    add-int/lit8 v0, v0, 0x1

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :goto_b
    iput v0, p0, Lkk5;->f:I

    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final a()Landroid/view/MotionEvent;
    .locals 0

    .line 1
    iget-object p0, p0, Lkk5;->b:Lhv2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lhv2;->x:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lkg5;

    .line 8
    .line 9
    iget-object p0, p0, Lkg5;->y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/MotionEvent;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
