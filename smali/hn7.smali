.class public final Lhn7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvq;


# static fields
.field public static final N:Lrg;

.field public static final O:Lhn7;


# instance fields
.field public A:Lif2;

.field public B:Lwe2;

.field public C:Lnu5;

.field public D:Ldh2;

.field public final E:Ljava/util/concurrent/ThreadPoolExecutor;

.field public F:Landroid/content/Context;

.field public G:Lb01;

.field public H:Lbw5;

.field public I:Lwq;

.field public J:Lfr;

.field public K:Ljava/lang/String;

.field public L:Ljava/lang/String;

.field public M:Z

.field public final w:Ljava/util/concurrent/ConcurrentHashMap;

.field public final x:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final y:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public z:Loe2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lrg;->d()Lrg;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lhn7;->N:Lrg;

    .line 6
    .line 7
    new-instance v0, Lhn7;

    .line 8
    .line 9
    invoke-direct {v0}, Lhn7;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lhn7;->O:Lhn7;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lhn7;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    iput-boolean v1, p0, Lhn7;->M:Z

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    const-wide/16 v5, 0xa

    .line 31
    .line 32
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lhn7;->E:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lhn7;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    const/16 p0, 0x32

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v1, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    .line 53
    .line 54
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v1, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    .line 58
    .line 59
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const-string v1, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    .line 63
    .line 64
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public static a(Lof5;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-interface {p0}, Lof5;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "ms)"

    .line 6
    .line 7
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-string v4, "#.####"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Lof5;->c()Lyk7;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lyk7;->G()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-virtual {p0}, Lyk7;->H()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v0, Ljava/text/DecimalFormat;

    .line 31
    .line 32
    invoke-direct {v0, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    long-to-double v4, v5

    .line 36
    div-double/2addr v4, v2

    .line 37
    invoke-virtual {v0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "trace metric: "

    .line 42
    .line 43
    const-string v3, " (duration: "

    .line 44
    .line 45
    invoke-static {v2, p0, v3, v0, v1}, Lpb4;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_0
    invoke-interface {p0}, Lof5;->d()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, Lof5;->e()Lry4;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lry4;->W()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lry4;->N()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const-wide/16 v5, 0x0

    .line 72
    .line 73
    :goto_0
    invoke-virtual {p0}, Lry4;->S()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lry4;->I()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const-string v0, "UNKNOWN"

    .line 89
    .line 90
    :goto_1
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 91
    .line 92
    invoke-virtual {p0}, Lry4;->P()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance v7, Ljava/text/DecimalFormat;

    .line 97
    .line 98
    invoke-direct {v7, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    long-to-double v4, v5

    .line 102
    div-double/2addr v4, v2

    .line 103
    invoke-virtual {v7, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-string v3, " (responseCode: "

    .line 108
    .line 109
    const-string v4, ", responseTime: "

    .line 110
    .line 111
    const-string v5, "network request trace: "

    .line 112
    .line 113
    invoke-static {v5, p0, v3, v0, v4}, Lf21;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0, v2, v1}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_3
    invoke-interface {p0}, Lof5;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    invoke-interface {p0}, Lof5;->f()Lku2;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 133
    .line 134
    invoke-virtual {p0}, Lku2;->A()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p0}, Lku2;->x()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {p0}, Lku2;->w()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    new-instance v2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v3, "gauges (hasMetadata: "

    .line 149
    .line 150
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v0, ", cpuGaugeCount: "

    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v0, ", memoryGaugeCount: "

    .line 165
    .line 166
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v0, ")"

    .line 170
    .line 171
    invoke-static {v2, p0, v0}, Lhl6;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :cond_4
    const-string p0, "log"

    .line 177
    .line 178
    return-object p0
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
.end method


# virtual methods
.method public final b(Lnf5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lhn7;->I:Lwq;

    .line 8
    .line 9
    const-string p1, "_fstec"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lwq;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Lnf5;->d()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lhn7;->I:Lwq;

    .line 22
    .line 23
    const-string p1, "_fsntc"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lwq;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
    .line 29
.end method

.method public final c(Lyk7;Ljr;)V
    .locals 2

    .line 1
    new-instance v0, Lti;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, v1}, Lti;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lhn7;->E:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final d(Lmf5;Ljr;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lhn7;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    const-string v2, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const-string v5, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const-string v8, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    invoke-virtual {p1}, Lmf5;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-eqz v11, :cond_0

    .line 53
    .line 54
    if-lez v4, :cond_0

    .line 55
    .line 56
    sub-int/2addr v4, v1

    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Lmf5;->d()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    if-lez v7, :cond_1

    .line 72
    .line 73
    sub-int/2addr v7, v1

    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p1}, Lmf5;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    if-lez v10, :cond_2

    .line 89
    .line 90
    sub-int/2addr v10, v1

    .line 91
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :goto_0
    sget-object v0, Lhn7;->N:Lrg;

    .line 99
    .line 100
    const-string v1, "Transport is not initialized yet, %s will be queued for to be dispatched later"

    .line 101
    .line 102
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v1, v2}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, Lhn7;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 114
    .line 115
    new-instance v0, Lkf5;

    .line 116
    .line 117
    invoke-direct {v0, p1, p2}, Lkf5;-><init>(Lmf5;Ljr;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    sget-object p0, Lhn7;->N:Lrg;

    .line 125
    .line 126
    const-string p2, "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."

    .line 127
    .line 128
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    filled-new-array {p1, v3, v6, v9}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p2, p1}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    sget-object v0, Lhn7;->N:Lrg;

    .line 141
    .line 142
    iget-object v2, p0, Lhn7;->G:Lb01;

    .line 143
    .line 144
    invoke-virtual {v2}, Lb01;->n()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    const/4 v3, 0x0

    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    iget-object v2, p0, Lhn7;->J:Lfr;

    .line 152
    .line 153
    iget-object v2, v2, Lqu2;->x:Lcom/google/protobuf/b;

    .line 154
    .line 155
    check-cast v2, Lir;

    .line 156
    .line 157
    invoke-virtual {v2}, Lir;->A()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_4

    .line 162
    .line 163
    iget-boolean v2, p0, Lhn7;->M:Z

    .line 164
    .line 165
    if-nez v2, :cond_4

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_4
    :try_start_0
    iget-object v2, p0, Lhn7;->B:Lwe2;

    .line 169
    .line 170
    check-cast v2, Lve2;

    .line 171
    .line 172
    invoke-virtual {v2}, Lve2;->c()Lyb9;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 177
    .line 178
    const-wide/32 v5, 0xea60

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v5, v6, v4}, Lb35;->c(Lyb9;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :catch_0
    move-exception v2

    .line 189
    goto :goto_1

    .line 190
    :catch_1
    move-exception v2

    .line 191
    goto :goto_2

    .line 192
    :catch_2
    move-exception v2

    .line 193
    goto :goto_3

    .line 194
    :goto_1
    const-string v4, "Task to retrieve Installation Id is timed out: %s"

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v0, v4, v2}, Lrg;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_2
    const-string v4, "Task to retrieve Installation Id is interrupted: %s"

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v0, v4, v2}, Lrg;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_3
    const-string v4, "Unable to retrieve Installation Id: %s"

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v0, v4, v2}, Lrg;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :goto_4
    move-object v2, v3

    .line 236
    :goto_5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-nez v4, :cond_5

    .line 241
    .line 242
    iget-object v0, p0, Lhn7;->J:Lfr;

    .line 243
    .line 244
    invoke-virtual {v0}, Lqu2;->h()V

    .line 245
    .line 246
    .line 247
    iget-object v0, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 248
    .line 249
    check-cast v0, Lir;

    .line 250
    .line 251
    invoke-static {v0, v2}, Lir;->v(Lir;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_5
    const-string v2, "Firebase Installation Id is empty, contact Firebase Support for debugging."

    .line 256
    .line 257
    invoke-virtual {v0, v2}, Lrg;->f(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_6
    :goto_6
    iget-object v0, p0, Lhn7;->J:Lfr;

    .line 261
    .line 262
    invoke-virtual {v0}, Lqu2;->h()V

    .line 263
    .line 264
    .line 265
    iget-object v2, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 266
    .line 267
    check-cast v2, Lir;

    .line 268
    .line 269
    invoke-static {v2, p2}, Lir;->t(Lir;Ljr;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, Lmf5;->b()Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-nez p2, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1}, Lmf5;->d()Z

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    if-eqz p2, :cond_b

    .line 283
    .line 284
    :cond_7
    iget-object p2, v0, Lqu2;->w:Lcom/google/protobuf/b;

    .line 285
    .line 286
    const/4 v2, 0x5

    .line 287
    invoke-virtual {p2, v2}, Lcom/google/protobuf/b;->k(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, Lqu2;

    .line 292
    .line 293
    iget-object v2, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 294
    .line 295
    invoke-virtual {v2}, Lcom/google/protobuf/b;->n()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    iget-object v4, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 300
    .line 301
    if-nez v2, :cond_8

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    sget-object v2, Lau5;->c:Lau5;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v2, v5}, Lau5;->a(Ljava/lang/Class;)Log6;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2, v4}, Log6;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4}, Lcom/google/protobuf/b;->o()V

    .line 324
    .line 325
    .line 326
    iget-object v4, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 327
    .line 328
    :goto_7
    iput-object v4, p2, Lqu2;->x:Lcom/google/protobuf/b;

    .line 329
    .line 330
    move-object v0, p2

    .line 331
    check-cast v0, Lfr;

    .line 332
    .line 333
    iget-object p2, p0, Lhn7;->A:Lif2;

    .line 334
    .line 335
    if-nez p2, :cond_9

    .line 336
    .line 337
    iget-object p2, p0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 338
    .line 339
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 340
    .line 341
    .line 342
    move-result p2

    .line 343
    if-eqz p2, :cond_9

    .line 344
    .line 345
    sget-object p2, Lif2;->b:Lrg;

    .line 346
    .line 347
    invoke-static {}, Loe2;->c()Loe2;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    const-class v2, Lif2;

    .line 352
    .line 353
    invoke-virtual {p2, v2}, Loe2;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    check-cast p2, Lif2;

    .line 358
    .line 359
    iput-object p2, p0, Lhn7;->A:Lif2;

    .line 360
    .line 361
    :cond_9
    iget-object p2, p0, Lhn7;->A:Lif2;

    .line 362
    .line 363
    if-eqz p2, :cond_a

    .line 364
    .line 365
    new-instance v2, Ljava/util/HashMap;

    .line 366
    .line 367
    iget-object p2, p2, Lif2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 368
    .line 369
    invoke-direct {v2, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :cond_a
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 374
    .line 375
    :goto_8
    invoke-virtual {v0}, Lqu2;->h()V

    .line 376
    .line 377
    .line 378
    iget-object p2, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 379
    .line 380
    check-cast p2, Lir;

    .line 381
    .line 382
    invoke-static {p2}, Lir;->u(Lir;)Lif4;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-virtual {p2, v2}, Lif4;->putAll(Ljava/util/Map;)V

    .line 387
    .line 388
    .line 389
    :cond_b
    invoke-virtual {p1}, Lqu2;->h()V

    .line 390
    .line 391
    .line 392
    iget-object p2, p1, Lqu2;->x:Lcom/google/protobuf/b;

    .line 393
    .line 394
    check-cast p2, Lnf5;

    .line 395
    .line 396
    invoke-virtual {v0}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Lir;

    .line 401
    .line 402
    invoke-static {p2, v0}, Lnf5;->s(Lnf5;Lir;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    check-cast p1, Lnf5;

    .line 410
    .line 411
    iget-object p2, p0, Lhn7;->G:Lb01;

    .line 412
    .line 413
    invoke-virtual {p2}, Lb01;->n()Z

    .line 414
    .line 415
    .line 416
    move-result p2

    .line 417
    if-nez p2, :cond_c

    .line 418
    .line 419
    sget-object p0, Lhn7;->N:Lrg;

    .line 420
    .line 421
    const-string p2, "Performance collection is not enabled, dropping %s"

    .line 422
    .line 423
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p0, p2, p1}, Lrg;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_1e

    .line 435
    .line 436
    :cond_c
    invoke-virtual {p1}, Lnf5;->w()Lir;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    invoke-virtual {p2}, Lir;->A()Z

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    if-nez p2, :cond_d

    .line 445
    .line 446
    sget-object p0, Lhn7;->N:Lrg;

    .line 447
    .line 448
    const-string p2, "App Instance ID is null or empty, dropping %s"

    .line 449
    .line 450
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p0, p2, p1}, Lrg;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_1e

    .line 462
    .line 463
    :cond_d
    iget-object p2, p0, Lhn7;->F:Landroid/content/Context;

    .line 464
    .line 465
    sget-object v0, Lpf5;->a:Ljava/util/regex/Pattern;

    .line 466
    .line 467
    new-instance v0, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_e

    .line 477
    .line 478
    new-instance v2, Lhf2;

    .line 479
    .line 480
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-direct {v2, v4}, Lhf2;-><init>(Lyk7;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :cond_e
    invoke-virtual {p1}, Lnf5;->d()Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-eqz v2, :cond_f

    .line 495
    .line 496
    new-instance v2, Lgf2;

    .line 497
    .line 498
    invoke-virtual {p1}, Lnf5;->e()Lry4;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    invoke-direct {v2, v4, p2}, Lgf2;-><init>(Lry4;Landroid/content/Context;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    :cond_f
    invoke-virtual {p1}, Lnf5;->x()Z

    .line 509
    .line 510
    .line 511
    move-result p2

    .line 512
    if-eqz p2, :cond_10

    .line 513
    .line 514
    new-instance p2, Ldf2;

    .line 515
    .line 516
    invoke-virtual {p1}, Lnf5;->w()Lir;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-direct {p2, v2}, Ldf2;-><init>(Lir;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_10
    invoke-virtual {p1}, Lnf5;->a()Z

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    if-eqz p2, :cond_11

    .line 531
    .line 532
    new-instance p2, Lff2;

    .line 533
    .line 534
    invoke-virtual {p1}, Lnf5;->f()Lku2;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-direct {p2, v2}, Lff2;-><init>(Lku2;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 545
    .line 546
    .line 547
    move-result p2

    .line 548
    if-eqz p2, :cond_12

    .line 549
    .line 550
    invoke-static {}, Lrg;->d()Lrg;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    const-string p2, "No validators found for PerfMetric."

    .line 555
    .line 556
    invoke-virtual {p0, p2}, Lrg;->a(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object p2

    .line 564
    :cond_13
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_14

    .line 569
    .line 570
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    check-cast v0, Lpf5;

    .line 575
    .line 576
    invoke-virtual {v0}, Lpf5;->a()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_13

    .line 581
    .line 582
    :goto_9
    sget-object p0, Lhn7;->N:Lrg;

    .line 583
    .line 584
    const-string p2, "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."

    .line 585
    .line 586
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    invoke-virtual {p0, p2, p1}, Lrg;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_1e

    .line 598
    .line 599
    :cond_14
    iget-object p2, p0, Lhn7;->H:Lbw5;

    .line 600
    .line 601
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 609
    .line 610
    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    if-eqz v0, :cond_1a

    .line 616
    .line 617
    iget-object v0, p2, Lbw5;->a:Lb01;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    const-class v2, La11;

    .line 623
    .line 624
    monitor-enter v2

    .line 625
    :try_start_1
    sget-object v8, La11;->G:La11;

    .line 626
    .line 627
    if-nez v8, :cond_15

    .line 628
    .line 629
    new-instance v8, La11;

    .line 630
    .line 631
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 632
    .line 633
    .line 634
    sput-object v8, La11;->G:La11;

    .line 635
    .line 636
    goto :goto_a

    .line 637
    :catchall_0
    move-exception p0

    .line 638
    goto/16 :goto_c

    .line 639
    .line 640
    :cond_15
    :goto_a
    sget-object v8, La11;->G:La11;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 641
    .line 642
    monitor-exit v2

    .line 643
    iget-object v2, v0, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 644
    .line 645
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    const-string v9, "fpr_vc_trace_sampling_rate"

    .line 649
    .line 650
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)Ln75;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v2}, Ln75;->b()Z

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    if-eqz v9, :cond_16

    .line 659
    .line 660
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    check-cast v9, Ljava/lang/Double;

    .line 665
    .line 666
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 667
    .line 668
    .line 669
    move-result-wide v9

    .line 670
    invoke-static {v9, v10}, Lb01;->o(D)Z

    .line 671
    .line 672
    .line 673
    move-result v9

    .line 674
    if-eqz v9, :cond_16

    .line 675
    .line 676
    iget-object v0, v0, Lb01;->c:Lzt1;

    .line 677
    .line 678
    const-string v8, "com.google.firebase.perf.TraceSamplingRate"

    .line 679
    .line 680
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v9

    .line 684
    check-cast v9, Ljava/lang/Double;

    .line 685
    .line 686
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 687
    .line 688
    .line 689
    move-result-wide v9

    .line 690
    invoke-virtual {v0, v8, v9, v10}, Lzt1;->e(Ljava/lang/String;D)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    check-cast v0, Ljava/lang/Double;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 700
    .line 701
    .line 702
    move-result-wide v8

    .line 703
    goto :goto_b

    .line 704
    :cond_16
    invoke-virtual {v0, v8}, Lb01;->b(Lwe;)Ln75;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-virtual {v2}, Ln75;->b()Z

    .line 709
    .line 710
    .line 711
    move-result v8

    .line 712
    if-eqz v8, :cond_17

    .line 713
    .line 714
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v8

    .line 718
    check-cast v8, Ljava/lang/Double;

    .line 719
    .line 720
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 721
    .line 722
    .line 723
    move-result-wide v8

    .line 724
    invoke-static {v8, v9}, Lb01;->o(D)Z

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    if-eqz v8, :cond_17

    .line 729
    .line 730
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    check-cast v0, Ljava/lang/Double;

    .line 735
    .line 736
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 737
    .line 738
    .line 739
    move-result-wide v8

    .line 740
    goto :goto_b

    .line 741
    :cond_17
    iget-object v0, v0, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 742
    .line 743
    invoke-virtual {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-eqz v0, :cond_18

    .line 748
    .line 749
    move-wide v8, v6

    .line 750
    goto :goto_b

    .line 751
    :cond_18
    move-wide v8, v4

    .line 752
    :goto_b
    iget-wide v10, p2, Lbw5;->b:D

    .line 753
    .line 754
    cmpg-double v0, v10, v8

    .line 755
    .line 756
    if-gez v0, :cond_19

    .line 757
    .line 758
    goto :goto_d

    .line 759
    :cond_19
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {v0}, Lyk7;->I()Lpf3;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-static {v0}, Lbw5;->a(Lpf3;)Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-nez v0, :cond_1a

    .line 772
    .line 773
    goto/16 :goto_14

    .line 774
    .line 775
    :goto_c
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 776
    throw p0

    .line 777
    :cond_1a
    :goto_d
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    if-eqz v0, :cond_20

    .line 782
    .line 783
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v0}, Lyk7;->H()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    const-string v2, "_st_"

    .line 792
    .line 793
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    if-eqz v0, :cond_20

    .line 798
    .line 799
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v0}, Lyk7;->B()Z

    .line 804
    .line 805
    .line 806
    move-result v0

    .line 807
    if-eqz v0, :cond_20

    .line 808
    .line 809
    iget-object v0, p2, Lbw5;->a:Lb01;

    .line 810
    .line 811
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    const-class v2, Lj01;

    .line 815
    .line 816
    monitor-enter v2

    .line 817
    :try_start_3
    sget-object v8, Lj01;->G:Lj01;

    .line 818
    .line 819
    if-nez v8, :cond_1b

    .line 820
    .line 821
    new-instance v8, Lj01;

    .line 822
    .line 823
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 824
    .line 825
    .line 826
    sput-object v8, Lj01;->G:Lj01;

    .line 827
    .line 828
    goto :goto_e

    .line 829
    :catchall_1
    move-exception p0

    .line 830
    goto/16 :goto_10

    .line 831
    .line 832
    :cond_1b
    :goto_e
    sget-object v8, Lj01;->G:Lj01;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 833
    .line 834
    monitor-exit v2

    .line 835
    invoke-virtual {v0, v8}, Lb01;->h(Lwe;)Ln75;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-virtual {v2}, Ln75;->b()Z

    .line 840
    .line 841
    .line 842
    move-result v9

    .line 843
    if-eqz v9, :cond_1c

    .line 844
    .line 845
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    check-cast v2, Ljava/lang/Double;

    .line 850
    .line 851
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 852
    .line 853
    .line 854
    move-result-wide v9

    .line 855
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 856
    .line 857
    div-double/2addr v9, v11

    .line 858
    invoke-static {v9, v10}, Lb01;->o(D)Z

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    if-eqz v2, :cond_1c

    .line 863
    .line 864
    goto :goto_f

    .line 865
    :cond_1c
    iget-object v2, v0, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 866
    .line 867
    const-string v9, "fpr_vc_fragment_sampling_rate"

    .line 868
    .line 869
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)Ln75;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-virtual {v2}, Ln75;->b()Z

    .line 874
    .line 875
    .line 876
    move-result v9

    .line 877
    if-eqz v9, :cond_1d

    .line 878
    .line 879
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v9

    .line 883
    check-cast v9, Ljava/lang/Double;

    .line 884
    .line 885
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 886
    .line 887
    .line 888
    move-result-wide v9

    .line 889
    invoke-static {v9, v10}, Lb01;->o(D)Z

    .line 890
    .line 891
    .line 892
    move-result v9

    .line 893
    if-eqz v9, :cond_1d

    .line 894
    .line 895
    iget-object v0, v0, Lb01;->c:Lzt1;

    .line 896
    .line 897
    const-string v8, "com.google.firebase.perf.FragmentSamplingRate"

    .line 898
    .line 899
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v9

    .line 903
    check-cast v9, Ljava/lang/Double;

    .line 904
    .line 905
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 906
    .line 907
    .line 908
    move-result-wide v9

    .line 909
    invoke-virtual {v0, v8, v9, v10}, Lzt1;->e(Ljava/lang/String;D)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    check-cast v0, Ljava/lang/Double;

    .line 917
    .line 918
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 919
    .line 920
    .line 921
    move-result-wide v9

    .line 922
    goto :goto_f

    .line 923
    :cond_1d
    invoke-virtual {v0, v8}, Lb01;->b(Lwe;)Ln75;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-virtual {v0}, Ln75;->b()Z

    .line 928
    .line 929
    .line 930
    move-result v2

    .line 931
    if-eqz v2, :cond_1e

    .line 932
    .line 933
    invoke-virtual {v0}, Ln75;->a()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    check-cast v2, Ljava/lang/Double;

    .line 938
    .line 939
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 940
    .line 941
    .line 942
    move-result-wide v8

    .line 943
    invoke-static {v8, v9}, Lb01;->o(D)Z

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    if-eqz v2, :cond_1e

    .line 948
    .line 949
    invoke-virtual {v0}, Ln75;->a()Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    check-cast v0, Ljava/lang/Double;

    .line 954
    .line 955
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 956
    .line 957
    .line 958
    move-result-wide v9

    .line 959
    goto :goto_f

    .line 960
    :cond_1e
    const-wide/16 v9, 0x0

    .line 961
    .line 962
    :goto_f
    iget-wide v11, p2, Lbw5;->c:D

    .line 963
    .line 964
    cmpg-double v0, v11, v9

    .line 965
    .line 966
    if-gez v0, :cond_1f

    .line 967
    .line 968
    goto :goto_11

    .line 969
    :cond_1f
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    invoke-virtual {v0}, Lyk7;->I()Lpf3;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    invoke-static {v0}, Lbw5;->a(Lpf3;)Z

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    if-nez v0, :cond_20

    .line 982
    .line 983
    goto/16 :goto_14

    .line 984
    .line 985
    :goto_10
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 986
    throw p0

    .line 987
    :cond_20
    :goto_11
    invoke-virtual {p1}, Lnf5;->d()Z

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    if-eqz v0, :cond_26

    .line 992
    .line 993
    iget-object v0, p2, Lbw5;->a:Lb01;

    .line 994
    .line 995
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    const-class v2, Lo01;

    .line 999
    .line 1000
    monitor-enter v2

    .line 1001
    :try_start_5
    sget-object v8, Lo01;->G:Lo01;

    .line 1002
    .line 1003
    if-nez v8, :cond_21

    .line 1004
    .line 1005
    new-instance v8, Lo01;

    .line 1006
    .line 1007
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1008
    .line 1009
    .line 1010
    sput-object v8, Lo01;->G:Lo01;

    .line 1011
    .line 1012
    goto :goto_12

    .line 1013
    :catchall_2
    move-exception p0

    .line 1014
    goto/16 :goto_15

    .line 1015
    .line 1016
    :cond_21
    :goto_12
    sget-object v8, Lo01;->G:Lo01;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1017
    .line 1018
    monitor-exit v2

    .line 1019
    iget-object v2, v0, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 1020
    .line 1021
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    const-string v9, "fpr_vc_network_request_sampling_rate"

    .line 1025
    .line 1026
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)Ln75;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    invoke-virtual {v2}, Ln75;->b()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v9

    .line 1034
    if-eqz v9, :cond_22

    .line 1035
    .line 1036
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v9

    .line 1040
    check-cast v9, Ljava/lang/Double;

    .line 1041
    .line 1042
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 1043
    .line 1044
    .line 1045
    move-result-wide v9

    .line 1046
    invoke-static {v9, v10}, Lb01;->o(D)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v9

    .line 1050
    if-eqz v9, :cond_22

    .line 1051
    .line 1052
    iget-object v0, v0, Lb01;->c:Lzt1;

    .line 1053
    .line 1054
    const-string v4, "com.google.firebase.perf.NetworkRequestSamplingRate"

    .line 1055
    .line 1056
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v5

    .line 1060
    check-cast v5, Ljava/lang/Double;

    .line 1061
    .line 1062
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1063
    .line 1064
    .line 1065
    move-result-wide v5

    .line 1066
    invoke-virtual {v0, v4, v5, v6}, Lzt1;->e(Ljava/lang/String;D)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    check-cast v0, Ljava/lang/Double;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v4

    .line 1079
    goto :goto_13

    .line 1080
    :cond_22
    invoke-virtual {v0, v8}, Lb01;->b(Lwe;)Ln75;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    invoke-virtual {v2}, Ln75;->b()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v8

    .line 1088
    if-eqz v8, :cond_23

    .line 1089
    .line 1090
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v8

    .line 1094
    check-cast v8, Ljava/lang/Double;

    .line 1095
    .line 1096
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v8

    .line 1100
    invoke-static {v8, v9}, Lb01;->o(D)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v8

    .line 1104
    if-eqz v8, :cond_23

    .line 1105
    .line 1106
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    check-cast v0, Ljava/lang/Double;

    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1113
    .line 1114
    .line 1115
    move-result-wide v4

    .line 1116
    goto :goto_13

    .line 1117
    :cond_23
    iget-object v0, v0, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 1118
    .line 1119
    invoke-virtual {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    if-eqz v0, :cond_24

    .line 1124
    .line 1125
    move-wide v4, v6

    .line 1126
    :cond_24
    :goto_13
    iget-wide v6, p2, Lbw5;->b:D

    .line 1127
    .line 1128
    cmpg-double p2, v6, v4

    .line 1129
    .line 1130
    if-gez p2, :cond_25

    .line 1131
    .line 1132
    goto :goto_16

    .line 1133
    :cond_25
    invoke-virtual {p1}, Lnf5;->e()Lry4;

    .line 1134
    .line 1135
    .line 1136
    move-result-object p2

    .line 1137
    invoke-virtual {p2}, Lry4;->J()Lpf3;

    .line 1138
    .line 1139
    .line 1140
    move-result-object p2

    .line 1141
    invoke-static {p2}, Lbw5;->a(Lpf3;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result p2

    .line 1145
    if-nez p2, :cond_26

    .line 1146
    .line 1147
    :goto_14
    invoke-virtual {p0, p1}, Lhn7;->b(Lnf5;)V

    .line 1148
    .line 1149
    .line 1150
    sget-object p0, Lhn7;->N:Lrg;

    .line 1151
    .line 1152
    const-string p2, "Event dropped due to device sampling - %s"

    .line 1153
    .line 1154
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object p1

    .line 1158
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object p1

    .line 1162
    invoke-virtual {p0, p2, p1}, Lrg;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1163
    .line 1164
    .line 1165
    goto/16 :goto_1e

    .line 1166
    .line 1167
    :goto_15
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1168
    throw p0

    .line 1169
    :cond_26
    :goto_16
    iget-object p2, p0, Lhn7;->H:Lbw5;

    .line 1170
    .line 1171
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 1175
    .line 1176
    .line 1177
    move-result v0

    .line 1178
    if-eqz v0, :cond_28

    .line 1179
    .line 1180
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    invoke-virtual {v0}, Lyk7;->H()Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    const-string v2, "_fs"

    .line 1189
    .line 1190
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v0

    .line 1194
    if-nez v0, :cond_27

    .line 1195
    .line 1196
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v0}, Lyk7;->H()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    const-string v2, "_bs"

    .line 1205
    .line 1206
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v0

    .line 1210
    if-eqz v0, :cond_28

    .line 1211
    .line 1212
    :cond_27
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-virtual {v0}, Lyk7;->C()I

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    if-lez v0, :cond_28

    .line 1221
    .line 1222
    goto :goto_17

    .line 1223
    :cond_28
    invoke-virtual {p1}, Lnf5;->a()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-eqz v0, :cond_29

    .line 1228
    .line 1229
    :goto_17
    const/4 v1, 0x0

    .line 1230
    goto :goto_19

    .line 1231
    :cond_29
    invoke-virtual {p1}, Lnf5;->d()Z

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    if-eqz v0, :cond_2a

    .line 1236
    .line 1237
    iget-object p2, p2, Lbw5;->e:Law5;

    .line 1238
    .line 1239
    invoke-virtual {p2}, Law5;->b()Z

    .line 1240
    .line 1241
    .line 1242
    move-result p2

    .line 1243
    :goto_18
    xor-int/2addr v1, p2

    .line 1244
    goto :goto_19

    .line 1245
    :cond_2a
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 1246
    .line 1247
    .line 1248
    move-result v0

    .line 1249
    if-eqz v0, :cond_2b

    .line 1250
    .line 1251
    iget-object p2, p2, Lbw5;->d:Law5;

    .line 1252
    .line 1253
    invoke-virtual {p2}, Law5;->b()Z

    .line 1254
    .line 1255
    .line 1256
    move-result p2

    .line 1257
    goto :goto_18

    .line 1258
    :cond_2b
    :goto_19
    if-eqz v1, :cond_2c

    .line 1259
    .line 1260
    invoke-virtual {p0, p1}, Lhn7;->b(Lnf5;)V

    .line 1261
    .line 1262
    .line 1263
    sget-object p0, Lhn7;->N:Lrg;

    .line 1264
    .line 1265
    const-string p2, "Rate limited (per device) - %s"

    .line 1266
    .line 1267
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object p1

    .line 1271
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object p1

    .line 1275
    invoke-virtual {p0, p2, p1}, Lrg;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    goto/16 :goto_1e

    .line 1279
    .line 1280
    :cond_2c
    sget-object p2, Lhn7;->N:Lrg;

    .line 1281
    .line 1282
    invoke-virtual {p1}, Lnf5;->b()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v0

    .line 1286
    if-eqz v0, :cond_2e

    .line 1287
    .line 1288
    const-string v0, "Logging %s. In a minute, visit the Firebase console to view your data: %s"

    .line 1289
    .line 1290
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    invoke-virtual {p1}, Lnf5;->c()Lyk7;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    const-string v4, "?utm_source=perf-android-sdk&utm_medium=android-ide"

    .line 1299
    .line 1300
    invoke-virtual {v2}, Lyk7;->H()Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v2

    .line 1304
    const-string v5, "_st_"

    .line 1305
    .line 1306
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1307
    .line 1308
    .line 1309
    move-result v5

    .line 1310
    iget-object v6, p0, Lhn7;->L:Ljava/lang/String;

    .line 1311
    .line 1312
    iget-object v7, p0, Lhn7;->K:Ljava/lang/String;

    .line 1313
    .line 1314
    if-eqz v5, :cond_2d

    .line 1315
    .line 1316
    invoke-static {v6, v7}, Lgl0;->W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1321
    .line 1322
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    const-string v5, "/troubleshooting/trace/SCREEN_TRACE/"

    .line 1329
    .line 1330
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v2

    .line 1343
    goto :goto_1a

    .line 1344
    :cond_2d
    invoke-static {v6, v7}, Lgl0;->W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1349
    .line 1350
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1354
    .line 1355
    .line 1356
    const-string v5, "/troubleshooting/trace/DURATION_TRACE/"

    .line 1357
    .line 1358
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v2

    .line 1371
    :goto_1a
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v1

    .line 1375
    invoke-virtual {p2, v0, v1}, Lrg;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    .line 1377
    .line 1378
    goto :goto_1b

    .line 1379
    :cond_2e
    const-string v0, "Logging %s"

    .line 1380
    .line 1381
    invoke-static {p1}, Lhn7;->a(Lof5;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v1

    .line 1385
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    invoke-virtual {p2, v0, v1}, Lrg;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1390
    .line 1391
    .line 1392
    :goto_1b
    iget-object p0, p0, Lhn7;->D:Ldh2;

    .line 1393
    .line 1394
    sget-object p2, Ldh2;->d:Lrg;

    .line 1395
    .line 1396
    iget-object v0, p0, Ldh2;->c:Lo9;

    .line 1397
    .line 1398
    if-nez v0, :cond_30

    .line 1399
    .line 1400
    iget-object v0, p0, Ldh2;->b:Lnu5;

    .line 1401
    .line 1402
    invoke-interface {v0}, Lnu5;->get()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    check-cast v0, Lcn7;

    .line 1407
    .line 1408
    if-eqz v0, :cond_2f

    .line 1409
    .line 1410
    iget-object v1, p0, Ldh2;->a:Ljava/lang/String;

    .line 1411
    .line 1412
    const-string v2, "proto"

    .line 1413
    .line 1414
    new-instance v4, Lm42;

    .line 1415
    .line 1416
    invoke-direct {v4, v2}, Lm42;-><init>(Ljava/lang/String;)V

    .line 1417
    .line 1418
    .line 1419
    new-instance v2, Lrf2;

    .line 1420
    .line 1421
    const/4 v5, 0x3

    .line 1422
    invoke-direct {v2, v5}, Lrf2;-><init>(I)V

    .line 1423
    .line 1424
    .line 1425
    check-cast v0, Ldn7;

    .line 1426
    .line 1427
    invoke-virtual {v0, v1, v4, v2}, Ldn7;->a(Ljava/lang/String;Lm42;Lul7;)Lo9;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    iput-object v0, p0, Ldh2;->c:Lo9;

    .line 1432
    .line 1433
    goto :goto_1c

    .line 1434
    :cond_2f
    const-string v0, "Flg TransportFactory is not available at the moment"

    .line 1435
    .line 1436
    invoke-virtual {p2, v0}, Lrg;->f(Ljava/lang/String;)V

    .line 1437
    .line 1438
    .line 1439
    :cond_30
    :goto_1c
    iget-object p0, p0, Ldh2;->c:Lo9;

    .line 1440
    .line 1441
    if-eqz p0, :cond_31

    .line 1442
    .line 1443
    new-instance p2, Ln00;

    .line 1444
    .line 1445
    sget-object v0, Lto5;->w:Lto5;

    .line 1446
    .line 1447
    invoke-direct {p2, p1, v0, v3}, Ln00;-><init>(Ljava/lang/Object;Lto5;Lh10;)V

    .line 1448
    .line 1449
    .line 1450
    new-instance p1, Lkj6;

    .line 1451
    .line 1452
    const/16 v0, 0x10

    .line 1453
    .line 1454
    invoke-direct {p1, v0}, Lkj6;-><init>(I)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {p0, p2, p1}, Lo9;->K(Ln00;Ljn7;)V

    .line 1458
    .line 1459
    .line 1460
    goto :goto_1d

    .line 1461
    :cond_31
    const-string p0, "Unable to dispatch event because Flg Transport is not available"

    .line 1462
    .line 1463
    invoke-virtual {p2, p0}, Lrg;->f(Ljava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    :goto_1d
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 1467
    .line 1468
    .line 1469
    move-result-object p0

    .line 1470
    invoke-virtual {p0}, Lcom/google/firebase/perf/session/SessionManager;->stopGaugeCollectionIfSessionRunningTooLong()V

    .line 1471
    .line 1472
    .line 1473
    :goto_1e
    return-void
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

.method public final onUpdateAppState(Ljr;)V
    .locals 2

    .line 1
    sget-object v0, Ljr;->y:Ljr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v1

    .line 9
    :goto_0
    iput-boolean p1, p0, Lhn7;->M:Z

    .line 10
    .line 11
    iget-object p1, p0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lgn7;

    .line 20
    .line 21
    invoke-direct {p1, p0, v1}, Lgn7;-><init>(Lhn7;I)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lhn7;->E:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
