.class public final Lji3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic d:[Lyr3;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/ThreadLocal;

.field public final c:Lqe1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lhr5;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    sget-object v1, Lsi0;->w:Lsi0;

    .line 5
    .line 6
    const-class v2, Lji3;

    .line 7
    .line 8
    const-string v3, "dataStore"

    .line 9
    .line 10
    const-string v4, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lir5;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lb26;->a:Lc26;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lc26;->i(Lhr5;)Lxr3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    new-array v1, v1, [Lyr3;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v0, v1, v2

    .line 26
    .line 27
    sput-object v1, Lji3;->d:[Lyr3;

    .line 28
    .line 29
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lji3;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lji3;->b:Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    new-instance v0, Lbr4;

    .line 17
    .line 18
    new-instance v1, Lhi3;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, Lhi3;-><init>(Lji3;I)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x9

    .line 25
    .line 26
    invoke-direct {v0, v3, v1}, Lbr4;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lhi3;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v1, p0, v3}, Lhi3;-><init>(Lji3;I)V

    .line 33
    .line 34
    .line 35
    sget-object v3, Law1;->a:Ldn1;

    .line 36
    .line 37
    sget-object v3, Lcm1;->y:Lcm1;

    .line 38
    .line 39
    invoke-static {}, Lb85;->d()Lw77;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Lgl0;->E(Le81;)Lig0;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Lhn5;

    .line 55
    .line 56
    invoke-direct {v4, p2, v0, v1, v3}, Lhn5;-><init>(Ljava/lang/String;Lbr4;Lvr2;Lo81;)V

    .line 57
    .line 58
    .line 59
    sget-object p2, Lji3;->d:[Lyr3;

    .line 60
    .line 61
    aget-object p2, p2, v2

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object p2, v4, Lhn5;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Lgn5;

    .line 69
    .line 70
    if-nez p2, :cond_1

    .line 71
    .line 72
    iget-object p2, v4, Lhn5;->b:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter p2

    .line 75
    :try_start_0
    iget-object v2, v4, Lhn5;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lgn5;

    .line 78
    .line 79
    if-nez v2, :cond_0

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/util/List;

    .line 93
    .line 94
    new-instance v2, Lqm3;

    .line 95
    .line 96
    const/16 v5, 0x10

    .line 97
    .line 98
    invoke-direct {v2, v5, p1, v4}, Lqm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance p1, Lgd2;

    .line 105
    .line 106
    sget-object v5, Lhz2;->I:Lhz2;

    .line 107
    .line 108
    new-instance v6, Lhx4;

    .line 109
    .line 110
    const/16 v7, 0x8

    .line 111
    .line 112
    invoke-direct {v6, v7, v2}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lf81;

    .line 116
    .line 117
    const/16 v7, 0x1d

    .line 118
    .line 119
    invoke-direct {v2, v7}, Lf81;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p1, v5, v2, v6}, Lgd2;-><init>(Ltl6;Lvr2;Lsr2;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, Lgn5;

    .line 126
    .line 127
    new-instance v5, Ln0;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/16 v7, 0x1a

    .line 131
    .line 132
    invoke-direct {v5, v1, v6, v7}, Ln0;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v5}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v5, Ljf1;

    .line 140
    .line 141
    invoke-direct {v5, p1, v1, v0, v3}, Ljf1;-><init>(Lgd2;Ljava/util/List;Lw81;Lo81;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v2, v5}, Lgn5;-><init>(Lqe1;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, Lgn5;

    .line 148
    .line 149
    invoke-direct {p1, v2}, Lgn5;-><init>(Lqe1;)V

    .line 150
    .line 151
    .line 152
    iput-object p1, v4, Lhn5;->c:Ljava/lang/Object;

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :catchall_0
    move-exception p0

    .line 156
    goto :goto_1

    .line 157
    :cond_0
    :goto_0
    iget-object p1, v4, Lhn5;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Lgn5;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    monitor-exit p2

    .line 165
    move-object p2, p1

    .line 166
    goto :goto_2

    .line 167
    :goto_1
    monitor-exit p2

    .line 168
    throw p0

    .line 169
    :cond_1
    :goto_2
    iput-object p2, p0, Lji3;->c:Lqe1;

    .line 170
    .line 171
    return-void
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
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


# virtual methods
.method public final a(Lvr2;)V
    .locals 3

    .line 1
    new-instance v0, Lju1;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v2, v1}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lx32;->w:Lx32;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lar7;->U(Le81;Lgs2;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lpp4;

    .line 16
    .line 17
    return-void
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
