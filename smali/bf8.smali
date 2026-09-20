.class public abstract Lbf8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbf8;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
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
.end method

.method public static final a(La1;Lyx0;Lfw0;)Lve8;
    .locals 7

    .line 1
    sget-object v0, Lfw2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    invoke-static {v2, v0, v3}, Lrj1;->c(IILvc0;)Lad0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v4, Lej;->I:Lz97;

    .line 18
    .line 19
    invoke-virtual {v4}, Lz97;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Le81;

    .line 24
    .line 25
    invoke-static {v4}, Lgl0;->E(Le81;)Lig0;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, Lp0;

    .line 30
    .line 31
    const/16 v6, 0x19

    .line 32
    .line 33
    invoke-direct {v5, v0, v3, v6}, Lp0;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    invoke-static {v4, v3, v3, v5, v6}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 38
    .line 39
    .line 40
    new-instance v4, Lpb;

    .line 41
    .line 42
    const/16 v5, 0xb

    .line 43
    .line 44
    invoke-direct {v4, v5, v0}, Lpb;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lnx6;->c:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_0
    sget-object v5, Lnx6;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v5, v4}, Ldt0;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sput-object v4, Lnx6;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    monitor-exit v0

    .line 59
    invoke-static {}, Lnx6;->a()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    monitor-exit v0

    .line 65
    throw p0

    .line 66
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-lez v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    instance-of v1, v0, Lje;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    check-cast v0, Lje;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    :goto_1
    move-object v0, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :goto_2
    if-nez v0, :cond_3

    .line 90
    .line 91
    new-instance v0, Lje;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1, p1}, Lje;-><init>(Landroid/content/Context;Lyx0;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lje;->getView()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v4, Lbf8;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    invoke-virtual {p0, v1, v4}, La1;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-virtual {v0}, Lje;->getComposeViewContext()Lyx0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-eq v1, p1, :cond_4

    .line 114
    .line 115
    invoke-virtual {p0, p1}, La1;->m(Lyx0;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {p0}, La1;->getComposeViewContext$ui()Lyx0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-eqz p0, :cond_5

    .line 123
    .line 124
    invoke-virtual {p1}, Lyx0;->d()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lje;->setComposeViewContextIncrementedDuringInit$ui(Z)V

    .line 128
    .line 129
    .line 130
    :cond_5
    const p0, 0x7f09024f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    instance-of v2, v1, Lve8;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    move-object v3, v1

    .line 142
    check-cast v3, Lve8;

    .line 143
    .line 144
    :cond_6
    if-nez v3, :cond_7

    .line 145
    .line 146
    new-instance v3, Lve8;

    .line 147
    .line 148
    new-instance v1, Lgs7;

    .line 149
    .line 150
    invoke-virtual {v0}, Lje;->getRoot()Luy3;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-direct {v1, v2}, Lgs7;-><init>(Luy3;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Lyx0;->f()V

    .line 158
    .line 159
    .line 160
    iget-object v2, p1, Lyx0;->c:Lky0;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v4, Lpy0;

    .line 166
    .line 167
    invoke-direct {v4, v2, v1}, Lpy0;-><init>(Lky0;Lgs7;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v3, v0, v4}, Lve8;-><init>(Lje;Lpy0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-virtual {v3, p2}, Lve8;->c(Lgs2;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lyx0;->f()V

    .line 180
    .line 181
    .line 182
    iget-object p0, p1, Lyx0;->c:Lky0;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    new-instance p1, Laf8;

    .line 188
    .line 189
    invoke-direct {p1, p0}, Laf8;-><init>(Lky0;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, p1}, Lje;->setFrameEndScheduler$ui(Lx54;)V

    .line 193
    .line 194
    .line 195
    return-object v3
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
.end method
