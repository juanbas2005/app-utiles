.class public abstract Lby8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final A:Lay8;

.field public static final A0:Lay8;

.field public static final B:Lay8;

.field public static final B0:Lay8;

.field public static final C:Lay8;

.field public static final C0:Lay8;

.field public static final D:Lay8;

.field public static final D0:Lay8;

.field public static final E:Lay8;

.field public static final E0:Lay8;

.field public static final F:Lay8;

.field public static final F0:Lay8;

.field public static final G:Lay8;

.field public static final G0:Lay8;

.field public static final H:Lay8;

.field public static final H0:Lay8;

.field public static final I:Lay8;

.field public static final I0:Lay8;

.field public static final J:Lay8;

.field public static final J0:Lay8;

.field public static final K:Lay8;

.field public static final K0:Lay8;

.field public static final L:Lay8;

.field public static final L0:Lay8;

.field public static final M:Lay8;

.field public static final M0:Lay8;

.field public static final N:Lay8;

.field public static final N0:Lay8;

.field public static final O:Lay8;

.field public static final O0:Lay8;

.field public static final P:Lay8;

.field public static final P0:Lay8;

.field public static final Q:Lay8;

.field public static final Q0:Lay8;

.field public static final R:Lay8;

.field public static final R0:Lay8;

.field public static final S:Lay8;

.field public static final S0:Lay8;

.field public static final T:Lay8;

.field public static final T0:Lay8;

.field public static final U:Lay8;

.field public static final U0:Lay8;

.field public static final V:Lay8;

.field public static final V0:Lay8;

.field public static final W:Lay8;

.field public static final W0:Lay8;

.field public static final X:Lay8;

.field public static final X0:Lay8;

.field public static final Y:Lay8;

.field public static final Y0:Lay8;

.field public static final Z:Lay8;

.field public static final Z0:Lay8;

.field public static final a:Ljava/util/List;

.field public static final a0:Lay8;

.field public static final a1:Lay8;

.field public static final b:Lay8;

.field public static final b0:Lay8;

.field public static final b1:Lay8;

.field public static final c:Lay8;

.field public static final c0:Lay8;

.field public static final c1:Lay8;

.field public static final d:Lay8;

.field public static final d0:Lay8;

.field public static final d1:Lay8;

.field public static final e:Lay8;

.field public static final e0:Lay8;

.field public static final e1:Lay8;

.field public static final f:Lay8;

.field public static final f0:Lay8;

.field public static final f1:Lay8;

.field public static final g:Lay8;

.field public static final g0:Lay8;

.field public static final g1:Lay8;

.field public static final h:Lay8;

.field public static final h0:Lay8;

.field public static final h1:Lay8;

.field public static final i:Lay8;

.field public static final i0:Lay8;

.field public static final i1:Lay8;

.field public static final j:Lay8;

.field public static final j0:Lay8;

.field public static final j1:Lay8;

.field public static final k:Lay8;

.field public static final k0:Lay8;

.field public static final l:Lay8;

.field public static final l0:Lay8;

.field public static final m:Lay8;

.field public static final m0:Lay8;

.field public static final n:Lay8;

.field public static final n0:Lay8;

.field public static final o:Lay8;

.field public static final o0:Lay8;

.field public static final p:Lay8;

.field public static final p0:Lay8;

.field public static final q:Lay8;

.field public static final q0:Lay8;

.field public static final r:Lay8;

.field public static final r0:Lay8;

.field public static final s:Lay8;

.field public static final s0:Lay8;

.field public static final t:Lay8;

.field public static final t0:Lay8;

.field public static final u:Lay8;

.field public static final u0:Lay8;

.field public static final v:Lay8;

.field public static final v0:Lay8;

.field public static final w:Lay8;

.field public static final w0:Lay8;

.field public static final x:Lay8;

.field public static final x0:Lay8;

.field public static final y:Lay8;

.field public static final y0:Lay8;

.field public static final z:Lay8;

.field public static final z0:Lay8;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lby8;->a:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    const-wide/16 v0, 0x2710

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Ldx8;->z:Ldx8;

    .line 27
    .line 28
    const-string v2, "measurement.ad_id_cache_time"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v2, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sput-object v1, Lby8;->b:Lay8;

    .line 36
    .line 37
    const-wide/32 v1, 0x36ee80

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, Ljv2;->z:Ljv2;

    .line 45
    .line 46
    const-string v4, "measurement.app_uninstalled_additional_ad_id_cache_time"

    .line 47
    .line 48
    invoke-static {v4, v1, v2, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sput-object v2, Lby8;->c:Lay8;

    .line 53
    .line 54
    const-wide/32 v4, 0x5265c00

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v4, Ljv2;->B:Ljv2;

    .line 62
    .line 63
    const-string v5, "measurement.monitoring.sample_period_millis"

    .line 64
    .line 65
    invoke-static {v5, v2, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    sput-object v4, Lby8;->d:Lay8;

    .line 70
    .line 71
    sget-object v4, Ln63;->B:Ln63;

    .line 72
    .line 73
    const-string v5, "measurement.config.cache_time"

    .line 74
    .line 75
    invoke-static {v5, v2, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    sput-object v4, Lby8;->e:Lay8;

    .line 80
    .line 81
    sget-object v4, Ltz2;->C:Ltz2;

    .line 82
    .line 83
    const-string v5, "measurement.config.url_scheme"

    .line 84
    .line 85
    const-string v6, "https"

    .line 86
    .line 87
    invoke-static {v5, v6, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    sput-object v4, Lby8;->f:Lay8;

    .line 92
    .line 93
    sget-object v4, Ls63;->F:Ls63;

    .line 94
    .line 95
    const-string v5, "measurement.config.url_authority"

    .line 96
    .line 97
    const-string v7, "app-measurement.com"

    .line 98
    .line 99
    invoke-static {v5, v7, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    sput-object v4, Lby8;->g:Lay8;

    .line 104
    .line 105
    const/16 v4, 0x64

    .line 106
    .line 107
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    sget-object v5, Lts2;->F:Lts2;

    .line 112
    .line 113
    const-string v7, "measurement.upload.max_bundles"

    .line 114
    .line 115
    invoke-static {v7, v4, v5, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    sput-object v5, Lby8;->h:Lay8;

    .line 120
    .line 121
    const/high16 v5, 0x10000

    .line 122
    .line 123
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    sget-object v7, Lz53;->H:Lz53;

    .line 128
    .line 129
    const-string v8, "measurement.upload.max_batch_size"

    .line 130
    .line 131
    invoke-static {v8, v5, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    sput-object v7, Lby8;->i:Lay8;

    .line 136
    .line 137
    sget-object v7, Lhr2;->L:Lhr2;

    .line 138
    .line 139
    const-string v8, "measurement.upload.max_bundle_size"

    .line 140
    .line 141
    invoke-static {v8, v5, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    sput-object v5, Lby8;->j:Lay8;

    .line 146
    .line 147
    const/16 v5, 0x3e8

    .line 148
    .line 149
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    sget-object v7, Llx8;->x:Llx8;

    .line 154
    .line 155
    const-string v8, "measurement.upload.max_events_per_bundle"

    .line 156
    .line 157
    invoke-static {v8, v5, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    sput-object v7, Lby8;->k:Lay8;

    .line 162
    .line 163
    const v7, 0x186a0

    .line 164
    .line 165
    .line 166
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    sget-object v8, Lrx8;->y:Lrx8;

    .line 171
    .line 172
    const-string v9, "measurement.upload.max_events_per_day"

    .line 173
    .line 174
    invoke-static {v9, v7, v8, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    sput-object v8, Lby8;->l:Lay8;

    .line 179
    .line 180
    sget-object v8, Lor2;->y:Lor2;

    .line 181
    .line 182
    const-string v9, "measurement.upload.max_error_events_per_day"

    .line 183
    .line 184
    invoke-static {v9, v5, v8, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    sput-object v8, Lby8;->m:Lay8;

    .line 189
    .line 190
    const v8, 0xc350

    .line 191
    .line 192
    .line 193
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    sget-object v9, Lts2;->y:Lts2;

    .line 198
    .line 199
    const-string v10, "measurement.upload.max_public_events_per_day"

    .line 200
    .line 201
    invoke-static {v10, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    sput-object v8, Lby8;->n:Lay8;

    .line 206
    .line 207
    const/16 v8, 0x2710

    .line 208
    .line 209
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v9, Ljv2;->A:Ljv2;

    .line 214
    .line 215
    const-string v10, "measurement.upload.max_conversions_per_day"

    .line 216
    .line 217
    invoke-static {v10, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    sput-object v8, Lby8;->o:Lay8;

    .line 222
    .line 223
    const/16 v8, 0xa

    .line 224
    .line 225
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    sget-object v9, Ltz2;->z:Ltz2;

    .line 230
    .line 231
    const-string v10, "measurement.upload.max_realtime_events_per_day"

    .line 232
    .line 233
    invoke-static {v10, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    sput-object v9, Lby8;->p:Lay8;

    .line 238
    .line 239
    sget-object v9, Lz53;->z:Lz53;

    .line 240
    .line 241
    const-string v10, "measurement.store.max_stored_events_per_app"

    .line 242
    .line 243
    invoke-static {v10, v7, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    sput-object v7, Lby8;->q:Lay8;

    .line 248
    .line 249
    sget-object v7, Ln63;->z:Ln63;

    .line 250
    .line 251
    const-string v9, "measurement.upload.url"

    .line 252
    .line 253
    const-string v10, "https://app-measurement.com/a"

    .line 254
    .line 255
    invoke-static {v9, v10, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    sput-object v7, Lby8;->r:Lay8;

    .line 260
    .line 261
    sget-object v7, Ls63;->A:Ls63;

    .line 262
    .line 263
    const-string v9, "measurement.sgtm.google_signal.url"

    .line 264
    .line 265
    const-string v10, "https://app-measurement.com/s/d"

    .line 266
    .line 267
    invoke-static {v9, v10, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    sput-object v7, Lby8;->s:Lay8;

    .line 272
    .line 273
    sget-object v7, Lhr2;->C:Lhr2;

    .line 274
    .line 275
    const-string v9, "measurement.sgtm.service_upload_apps_list"

    .line 276
    .line 277
    const-string v10, ""

    .line 278
    .line 279
    invoke-static {v9, v10, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    sput-object v7, Lby8;->t:Lay8;

    .line 284
    .line 285
    sget-object v7, Lor2;->z:Lor2;

    .line 286
    .line 287
    const-string v9, "measurement.sgtm.upload.backoff_http_codes"

    .line 288
    .line 289
    const-string v11, "404,429,503,504"

    .line 290
    .line 291
    invoke-static {v9, v11, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    sput-object v7, Lby8;->u:Lay8;

    .line 296
    .line 297
    const-wide/32 v11, 0x927c0

    .line 298
    .line 299
    .line 300
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    sget-object v9, Lts2;->z:Lts2;

    .line 305
    .line 306
    const-string v11, "measurement.sgtm.upload.retry_interval"

    .line 307
    .line 308
    invoke-static {v11, v7, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    sput-object v9, Lby8;->v:Lay8;

    .line 313
    .line 314
    const-wide/32 v11, 0x1499700

    .line 315
    .line 316
    .line 317
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    sget-object v11, Ltz2;->A:Ltz2;

    .line 322
    .line 323
    const-string v12, "measurement.sgtm.upload.retry_max_wait"

    .line 324
    .line 325
    invoke-static {v12, v9, v11, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    sput-object v11, Lby8;->w:Lay8;

    .line 330
    .line 331
    const-wide/32 v11, 0x1b7740

    .line 332
    .line 333
    .line 334
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    sget-object v12, Lz53;->A:Lz53;

    .line 339
    .line 340
    const-string v13, "measurement.sgtm.batch.retry_interval"

    .line 341
    .line 342
    invoke-static {v13, v11, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    sput-object v12, Lby8;->x:Lay8;

    .line 347
    .line 348
    sget-object v12, Ln63;->A:Ln63;

    .line 349
    .line 350
    const-string v13, "measurement.sgtm.batch.retry_max_wait"

    .line 351
    .line 352
    invoke-static {v13, v9, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    sput-object v9, Lby8;->y:Lay8;

    .line 357
    .line 358
    sget-object v9, Ls63;->B:Ls63;

    .line 359
    .line 360
    const-string v12, "measurement.sgtm.batch.retry_max_count"

    .line 361
    .line 362
    invoke-static {v12, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    sput-object v8, Lby8;->z:Lay8;

    .line 367
    .line 368
    const/16 v8, 0x1388

    .line 369
    .line 370
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    sget-object v9, Lhr2;->D:Lhr2;

    .line 375
    .line 376
    const-string v12, "measurement.sgtm.upload.max_queued_batches"

    .line 377
    .line 378
    invoke-static {v12, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    sput-object v8, Lby8;->A:Lay8;

    .line 383
    .line 384
    const/4 v8, 0x5

    .line 385
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v8

    .line 389
    sget-object v9, Lor2;->A:Lor2;

    .line 390
    .line 391
    const-string v12, "measurement.sgtm.upload.batches_retrieval_limit"

    .line 392
    .line 393
    invoke-static {v12, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    sput-object v8, Lby8;->B:Lay8;

    .line 398
    .line 399
    const-wide/16 v8, 0x1388

    .line 400
    .line 401
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    sget-object v9, Lts2;->A:Lts2;

    .line 406
    .line 407
    const-string v12, "measurement.sgtm.upload.min_delay_after_startup"

    .line 408
    .line 409
    invoke-static {v12, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    sput-object v9, Lby8;->C:Lay8;

    .line 414
    .line 415
    const-wide/16 v12, 0x3e8

    .line 416
    .line 417
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    sget-object v12, Ljv2;->C:Ljv2;

    .line 422
    .line 423
    const-string v13, "measurement.sgtm.upload.min_delay_after_broadcast"

    .line 424
    .line 425
    invoke-static {v13, v9, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    sput-object v12, Lby8;->D:Lay8;

    .line 430
    .line 431
    sget-object v12, Ltz2;->B:Ltz2;

    .line 432
    .line 433
    const-string v13, "measurement.sgtm.upload.min_delay_after_background"

    .line 434
    .line 435
    invoke-static {v13, v7, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    sput-object v7, Lby8;->E:Lay8;

    .line 440
    .line 441
    const-wide/32 v12, 0xdbba00

    .line 442
    .line 443
    .line 444
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    sget-object v12, Lz53;->B:Lz53;

    .line 449
    .line 450
    const-string v13, "measurement.sgtm.batch.long_queuing_threshold"

    .line 451
    .line 452
    invoke-static {v13, v7, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    sput-object v7, Lby8;->F:Lay8;

    .line 457
    .line 458
    const-wide/32 v12, 0x2932e00

    .line 459
    .line 460
    .line 461
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    sget-object v12, Ls63;->C:Ls63;

    .line 466
    .line 467
    const-string v13, "measurement.upload.backoff_period"

    .line 468
    .line 469
    invoke-static {v13, v7, v12, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    sput-object v7, Lby8;->G:Lay8;

    .line 474
    .line 475
    sget-object v7, Lhr2;->E:Lhr2;

    .line 476
    .line 477
    const-string v12, "measurement.upload.window_interval"

    .line 478
    .line 479
    invoke-static {v12, v1, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 480
    .line 481
    .line 482
    sget-object v7, Lor2;->B:Lor2;

    .line 483
    .line 484
    const-string v12, "measurement.upload.interval"

    .line 485
    .line 486
    invoke-static {v12, v1, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    sput-object v7, Lby8;->H:Lay8;

    .line 491
    .line 492
    sget-object v7, Lts2;->B:Lts2;

    .line 493
    .line 494
    const-string v12, "measurement.upload.realtime_upload_interval"

    .line 495
    .line 496
    invoke-static {v12, v0, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    sput-object v0, Lby8;->I:Lay8;

    .line 501
    .line 502
    sget-object v0, Ljv2;->D:Ljv2;

    .line 503
    .line 504
    const-string v7, "measurement.upload.debug_upload_interval"

    .line 505
    .line 506
    invoke-static {v7, v9, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sput-object v0, Lby8;->J:Lay8;

    .line 511
    .line 512
    const-wide/16 v12, 0x1f4

    .line 513
    .line 514
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sget-object v7, Lz53;->C:Lz53;

    .line 519
    .line 520
    const-string v12, "measurement.upload.minimum_delay"

    .line 521
    .line 522
    invoke-static {v12, v0, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sput-object v0, Lby8;->K:Lay8;

    .line 527
    .line 528
    const-wide/32 v12, 0xea60

    .line 529
    .line 530
    .line 531
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sget-object v7, Ls63;->D:Ls63;

    .line 536
    .line 537
    const-string v12, "measurement.alarm_manager.minimum_interval"

    .line 538
    .line 539
    invoke-static {v12, v0, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sput-object v0, Lby8;->L:Lay8;

    .line 544
    .line 545
    sget-object v0, Lhr2;->F:Lhr2;

    .line 546
    .line 547
    const-string v7, "measurement.upload.stale_data_deletion_interval"

    .line 548
    .line 549
    invoke-static {v7, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    sput-object v0, Lby8;->M:Lay8;

    .line 554
    .line 555
    const-wide/32 v12, 0x240c8400

    .line 556
    .line 557
    .line 558
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    sget-object v2, Lts2;->C:Lts2;

    .line 563
    .line 564
    const-string v7, "measurement.upload.refresh_blacklisted_config_interval"

    .line 565
    .line 566
    invoke-static {v7, v0, v2, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    sput-object v2, Lby8;->N:Lay8;

    .line 571
    .line 572
    const-wide/16 v12, 0x3a98

    .line 573
    .line 574
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    sget-object v7, Ljv2;->E:Ljv2;

    .line 579
    .line 580
    const-string v12, "measurement.upload.initial_upload_delay_time"

    .line 581
    .line 582
    invoke-static {v12, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    sput-object v2, Lby8;->O:Lay8;

    .line 587
    .line 588
    sget-object v2, Lz53;->D:Lz53;

    .line 589
    .line 590
    const-string v7, "measurement.upload.retry_time"

    .line 591
    .line 592
    invoke-static {v7, v11, v2, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    sput-object v2, Lby8;->P:Lay8;

    .line 597
    .line 598
    const/4 v2, 0x6

    .line 599
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    sget-object v7, Ln63;->C:Ln63;

    .line 604
    .line 605
    const-string v11, "measurement.upload.retry_count"

    .line 606
    .line 607
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    sput-object v2, Lby8;->Q:Lay8;

    .line 612
    .line 613
    const-wide/32 v11, 0x1ee62800

    .line 614
    .line 615
    .line 616
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    sget-object v7, Ls63;->E:Ls63;

    .line 621
    .line 622
    const-string v11, "measurement.upload.max_queue_time"

    .line 623
    .line 624
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    sput-object v2, Lby8;->R:Lay8;

    .line 629
    .line 630
    const-wide/32 v11, 0x493e0

    .line 631
    .line 632
    .line 633
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    sget-object v7, Lhr2;->G:Lhr2;

    .line 638
    .line 639
    const-string v11, "measurement.upload.google_signal_max_queue_time"

    .line 640
    .line 641
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    sput-object v2, Lby8;->S:Lay8;

    .line 646
    .line 647
    const/4 v2, 0x4

    .line 648
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    sget-object v7, Lor2;->C:Lor2;

    .line 653
    .line 654
    const-string v11, "measurement.lifetimevalue.max_currency_tracked"

    .line 655
    .line 656
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    sput-object v2, Lby8;->T:Lay8;

    .line 661
    .line 662
    const/16 v2, 0xc8

    .line 663
    .line 664
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    sget-object v7, Lts2;->D:Lts2;

    .line 669
    .line 670
    const-string v11, "measurement.audience.filter_result_max_count"

    .line 671
    .line 672
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    sput-object v2, Lby8;->U:Lay8;

    .line 677
    .line 678
    const-string v2, "measurement.upload.max_public_user_properties"

    .line 679
    .line 680
    const/4 v7, 0x0

    .line 681
    invoke-static {v2, v4, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    sput-object v2, Lby8;->V:Lay8;

    .line 686
    .line 687
    const/16 v2, 0x7d0

    .line 688
    .line 689
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    const-string v11, "measurement.upload.max_event_name_cardinality"

    .line 694
    .line 695
    invoke-static {v11, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    sput-object v2, Lby8;->W:Lay8;

    .line 700
    .line 701
    const-string v2, "measurement.upload.max_public_event_params"

    .line 702
    .line 703
    invoke-static {v2, v4, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    sput-object v2, Lby8;->X:Lay8;

    .line 708
    .line 709
    sget-object v2, Ljv2;->F:Ljv2;

    .line 710
    .line 711
    const-string v11, "measurement.service_client.idle_disconnect_millis"

    .line 712
    .line 713
    invoke-static {v11, v8, v2, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    sput-object v2, Lby8;->Y:Lay8;

    .line 718
    .line 719
    sget-object v2, Ltz2;->D:Ltz2;

    .line 720
    .line 721
    const-string v8, "measurement.service_client.reconnect_millis"

    .line 722
    .line 723
    invoke-static {v8, v9, v2, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    sput-object v2, Lby8;->Z:Lay8;

    .line 728
    .line 729
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 730
    .line 731
    sget-object v8, Lz53;->E:Lz53;

    .line 732
    .line 733
    const-string v9, "measurement.test.test_boolean_flag"

    .line 734
    .line 735
    invoke-static {v9, v2, v8, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 736
    .line 737
    .line 738
    move-result-object v8

    .line 739
    sput-object v8, Lby8;->a0:Lay8;

    .line 740
    .line 741
    sget-object v8, Ln63;->D:Ln63;

    .line 742
    .line 743
    const-string v9, "measurement.test.test_string_flag"

    .line 744
    .line 745
    const-string v11, "---"

    .line 746
    .line 747
    invoke-static {v9, v11, v8, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    sput-object v8, Lby8;->b0:Lay8;

    .line 752
    .line 753
    const-wide/16 v8, -0x1

    .line 754
    .line 755
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    sget-object v9, Lhr2;->H:Lhr2;

    .line 760
    .line 761
    const-string v11, "measurement.test.test_long_flag"

    .line 762
    .line 763
    invoke-static {v11, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 764
    .line 765
    .line 766
    move-result-object v9

    .line 767
    sput-object v9, Lby8;->c0:Lay8;

    .line 768
    .line 769
    sget-object v9, Lor2;->D:Lor2;

    .line 770
    .line 771
    const-string v11, "measurement.test.test_cached_long_flag"

    .line 772
    .line 773
    const/4 v12, 0x1

    .line 774
    invoke-static {v11, v8, v9, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 775
    .line 776
    .line 777
    const/4 v8, -0x2

    .line 778
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v8

    .line 782
    sget-object v9, Lts2;->E:Lts2;

    .line 783
    .line 784
    const-string v11, "measurement.test.test_int_flag"

    .line 785
    .line 786
    invoke-static {v11, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 787
    .line 788
    .line 789
    move-result-object v8

    .line 790
    sput-object v8, Lby8;->d0:Lay8;

    .line 791
    .line 792
    const-wide/high16 v8, -0x3ff8000000000000L    # -3.0

    .line 793
    .line 794
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    sget-object v9, Ljv2;->G:Ljv2;

    .line 799
    .line 800
    const-string v11, "measurement.test.test_double_flag"

    .line 801
    .line 802
    invoke-static {v11, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    sput-object v8, Lby8;->e0:Lay8;

    .line 807
    .line 808
    const/16 v8, 0x32

    .line 809
    .line 810
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v8

    .line 814
    sget-object v9, Ltz2;->E:Ltz2;

    .line 815
    .line 816
    const-string v11, "measurement.experiment.max_ids"

    .line 817
    .line 818
    invoke-static {v11, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 819
    .line 820
    .line 821
    const/16 v8, 0x1b

    .line 822
    .line 823
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object v8

    .line 827
    sget-object v9, Lz53;->F:Lz53;

    .line 828
    .line 829
    const-string v11, "measurement.upload.max_item_scoped_custom_parameters"

    .line 830
    .line 831
    invoke-static {v11, v8, v9, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 832
    .line 833
    .line 834
    move-result-object v8

    .line 835
    sput-object v8, Lby8;->f0:Lay8;

    .line 836
    .line 837
    const/16 v8, 0x1f4

    .line 838
    .line 839
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    sget-object v9, Ln63;->E:Ln63;

    .line 844
    .line 845
    const-string v11, "measurement.upload.max_event_parameter_value_length"

    .line 846
    .line 847
    invoke-static {v11, v8, v9, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    sput-object v8, Lby8;->g0:Lay8;

    .line 852
    .line 853
    sget-object v8, Ls63;->G:Ls63;

    .line 854
    .line 855
    const-string v9, "measurement.max_bundles_per_iteration"

    .line 856
    .line 857
    invoke-static {v9, v4, v8, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    sput-object v4, Lby8;->h0:Lay8;

    .line 862
    .line 863
    sget-object v4, Lhr2;->I:Lhr2;

    .line 864
    .line 865
    const-string v8, "measurement.sdk.attribution.cache.ttl"

    .line 866
    .line 867
    invoke-static {v8, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    sput-object v0, Lby8;->i0:Lay8;

    .line 872
    .line 873
    const-wide/32 v8, 0x6ddd00

    .line 874
    .line 875
    .line 876
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    sget-object v4, Lor2;->E:Lor2;

    .line 881
    .line 882
    const-string v8, "measurement.redaction.app_instance_id.ttl"

    .line 883
    .line 884
    invoke-static {v8, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    sput-object v0, Lby8;->j0:Lay8;

    .line 889
    .line 890
    const/4 v0, 0x7

    .line 891
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    sget-object v4, Ljv2;->H:Ljv2;

    .line 896
    .line 897
    const-string v8, "measurement.rb.attribution.client.min_ad_services_version"

    .line 898
    .line 899
    invoke-static {v8, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    sput-object v0, Lby8;->k0:Lay8;

    .line 904
    .line 905
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    sget-object v4, Ltz2;->F:Ltz2;

    .line 910
    .line 911
    const-string v8, "measurement.dma_consent.max_daily_dcu_realtime_events"

    .line 912
    .line 913
    invoke-static {v8, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    sput-object v0, Lby8;->l0:Lay8;

    .line 918
    .line 919
    sget-object v0, Lz53;->G:Lz53;

    .line 920
    .line 921
    const-string v4, "measurement.rb.attribution.uri_scheme"

    .line 922
    .line 923
    invoke-static {v4, v6, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    sput-object v0, Lby8;->m0:Lay8;

    .line 928
    .line 929
    sget-object v0, Ln63;->F:Ln63;

    .line 930
    .line 931
    const-string v4, "measurement.rb.attribution.uri_authority"

    .line 932
    .line 933
    const-string v6, "google-analytics.com"

    .line 934
    .line 935
    invoke-static {v4, v6, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    sput-object v0, Lby8;->n0:Lay8;

    .line 940
    .line 941
    sget-object v0, Ls63;->H:Ls63;

    .line 942
    .line 943
    const-string v4, "measurement.rb.attribution.uri_path"

    .line 944
    .line 945
    const-string v6, "privacy-sandbox/register-app-conversion"

    .line 946
    .line 947
    invoke-static {v4, v6, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    sput-object v0, Lby8;->o0:Lay8;

    .line 952
    .line 953
    sget-object v0, Lhr2;->J:Lhr2;

    .line 954
    .line 955
    const-string v4, "measurement.session.engagement_interval"

    .line 956
    .line 957
    invoke-static {v4, v1, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    sput-object v0, Lby8;->p0:Lay8;

    .line 962
    .line 963
    sget-object v0, Lor2;->F:Lor2;

    .line 964
    .line 965
    const-string v4, "measurement.rb.attribution.app_allowlist"

    .line 966
    .line 967
    invoke-static {v4, v10, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    sput-object v0, Lby8;->q0:Lay8;

    .line 972
    .line 973
    sget-object v0, Lts2;->G:Lts2;

    .line 974
    .line 975
    const-string v4, "measurement.rb.attribution.user_properties"

    .line 976
    .line 977
    const-string v6, "_npa,npa|_fot,fot"

    .line 978
    .line 979
    invoke-static {v4, v6, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    sput-object v0, Lby8;->r0:Lay8;

    .line 984
    .line 985
    sget-object v0, Ljv2;->I:Ljv2;

    .line 986
    .line 987
    const-string v4, "measurement.rb.attribution.event_params"

    .line 988
    .line 989
    const-string v6, "value|currency"

    .line 990
    .line 991
    invoke-static {v4, v6, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    sput-object v0, Lby8;->s0:Lay8;

    .line 996
    .line 997
    sget-object v0, Ltz2;->G:Ltz2;

    .line 998
    .line 999
    const-string v4, "measurement.rb.attribution.query_parameters_to_remove"

    .line 1000
    .line 1001
    invoke-static {v4, v10, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    sput-object v0, Lby8;->t0:Lay8;

    .line 1006
    .line 1007
    const-wide/32 v8, 0x337f9800

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    sget-object v4, Ln63;->G:Ln63;

    .line 1015
    .line 1016
    const-string v6, "measurement.rb.attribution.max_queue_time"

    .line 1017
    .line 1018
    invoke-static {v6, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    sput-object v0, Lby8;->u0:Lay8;

    .line 1023
    .line 1024
    const/16 v0, 0x10

    .line 1025
    .line 1026
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    sget-object v4, Ls63;->I:Ls63;

    .line 1031
    .line 1032
    const-string v6, "measurement.rb.attribution.max_retry_delay_seconds"

    .line 1033
    .line 1034
    invoke-static {v6, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    sput-object v0, Lby8;->v0:Lay8;

    .line 1039
    .line 1040
    const/16 v0, 0x5a

    .line 1041
    .line 1042
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    sget-object v4, Lhr2;->K:Lhr2;

    .line 1047
    .line 1048
    const-string v6, "measurement.rb.attribution.client.min_time_after_boot_seconds"

    .line 1049
    .line 1050
    invoke-static {v6, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    sput-object v0, Lby8;->w0:Lay8;

    .line 1055
    .line 1056
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    sget-object v4, Lor2;->G:Lor2;

    .line 1061
    .line 1062
    const-string v6, "measurement.rb.attribution.max_trigger_uris_queried_at_once"

    .line 1063
    .line 1064
    invoke-static {v6, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1065
    .line 1066
    .line 1067
    sget-object v0, Lts2;->H:Lts2;

    .line 1068
    .line 1069
    const-string v4, "measurement.rb.max_trigger_registrations_per_day"

    .line 1070
    .line 1071
    invoke-static {v4, v5, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    sput-object v0, Lby8;->x0:Lay8;

    .line 1076
    .line 1077
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1078
    .line 1079
    sget-object v4, Ljv2;->J:Ljv2;

    .line 1080
    .line 1081
    const-string v5, "measurement.config.bundle_for_all_apps_on_backgrounded"

    .line 1082
    .line 1083
    invoke-static {v5, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v4

    .line 1087
    sput-object v4, Lby8;->y0:Lay8;

    .line 1088
    .line 1089
    sget-object v4, Ltz2;->H:Ltz2;

    .line 1090
    .line 1091
    const-string v5, "measurement.config.notify_trigger_uris_on_backgrounded"

    .line 1092
    .line 1093
    invoke-static {v5, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    sput-object v4, Lby8;->z0:Lay8;

    .line 1098
    .line 1099
    const/16 v4, 0xbb8

    .line 1100
    .line 1101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v4

    .line 1105
    sget-object v5, Lz53;->I:Lz53;

    .line 1106
    .line 1107
    const-string v6, "measurement.rb.attribution.notify_app_delay_millis"

    .line 1108
    .line 1109
    invoke-static {v6, v4, v5, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v4

    .line 1113
    sput-object v4, Lby8;->A0:Lay8;

    .line 1114
    .line 1115
    sget-object v4, Ln63;->H:Ln63;

    .line 1116
    .line 1117
    const-string v5, "measurement.config.default_flag_values"

    .line 1118
    .line 1119
    invoke-static {v5, v0, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1120
    .line 1121
    .line 1122
    sget-object v4, Ls63;->J:Ls63;

    .line 1123
    .line 1124
    const-string v5, "measurement.upload.diagnostic_upload_interval"

    .line 1125
    .line 1126
    invoke-static {v5, v1, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    sput-object v1, Lby8;->B0:Lay8;

    .line 1131
    .line 1132
    const-string v1, "measurement.quality.checksum"

    .line 1133
    .line 1134
    invoke-static {v1, v2, v7, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1

    .line 1138
    sput-object v1, Lby8;->C0:Lay8;

    .line 1139
    .line 1140
    sget-object v1, Lor2;->H:Lor2;

    .line 1141
    .line 1142
    const-string v4, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    .line 1143
    .line 1144
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v1

    .line 1148
    sput-object v1, Lby8;->D0:Lay8;

    .line 1149
    .line 1150
    sget-object v1, Lts2;->I:Lts2;

    .line 1151
    .line 1152
    const-string v4, "measurement.audience.refresh_event_count_filters_timestamp"

    .line 1153
    .line 1154
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    sput-object v1, Lby8;->E0:Lay8;

    .line 1159
    .line 1160
    sget-object v1, Ljv2;->K:Ljv2;

    .line 1161
    .line 1162
    const-string v4, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    .line 1163
    .line 1164
    invoke-static {v4, v2, v1, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    sput-object v1, Lby8;->F0:Lay8;

    .line 1169
    .line 1170
    sget-object v1, Ltz2;->I:Ltz2;

    .line 1171
    .line 1172
    const-string v4, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    .line 1173
    .line 1174
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    sput-object v1, Lby8;->G0:Lay8;

    .line 1179
    .line 1180
    sget-object v1, Lz53;->J:Lz53;

    .line 1181
    .line 1182
    const-string v4, "measurement.integration.disable_firebase_instance_id"

    .line 1183
    .line 1184
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    sput-object v1, Lby8;->H0:Lay8;

    .line 1189
    .line 1190
    sget-object v1, Ln63;->I:Ln63;

    .line 1191
    .line 1192
    const-string v4, "measurement.collection.service.update_with_analytics_fix"

    .line 1193
    .line 1194
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v1

    .line 1198
    sput-object v1, Lby8;->I0:Lay8;

    .line 1199
    .line 1200
    const v1, 0x31b50

    .line 1201
    .line 1202
    .line 1203
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    sget-object v4, Ldx8;->x:Ldx8;

    .line 1208
    .line 1209
    const-string v5, "measurement.service.storage_consent_support_version"

    .line 1210
    .line 1211
    invoke-static {v5, v1, v4, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    sput-object v1, Lby8;->J0:Lay8;

    .line 1216
    .line 1217
    sget-object v1, Lfx8;->x:Lfx8;

    .line 1218
    .line 1219
    const-string v4, "measurement.service.store_null_safelist"

    .line 1220
    .line 1221
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    sput-object v1, Lby8;->K0:Lay8;

    .line 1226
    .line 1227
    sget-object v1, Lhx8;->x:Lhx8;

    .line 1228
    .line 1229
    const-string v4, "measurement.service.store_safelist"

    .line 1230
    .line 1231
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    sput-object v1, Lby8;->L0:Lay8;

    .line 1236
    .line 1237
    sget-object v1, Ljx8;->x:Ljx8;

    .line 1238
    .line 1239
    const-string v4, "measurement.session_stitching_token_enabled"

    .line 1240
    .line 1241
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    sput-object v1, Lby8;->M0:Lay8;

    .line 1246
    .line 1247
    sget-object v1, Lnx8;->x:Lnx8;

    .line 1248
    .line 1249
    const-string v4, "measurement.sgtm.client.upload_on_backgrounded.dev"

    .line 1250
    .line 1251
    invoke-static {v4, v2, v1, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v1

    .line 1255
    sput-object v1, Lby8;->N0:Lay8;

    .line 1256
    .line 1257
    sget-object v1, Lpx8;->x:Lpx8;

    .line 1258
    .line 1259
    const-string v4, "measurement.rb.attribution.service"

    .line 1260
    .line 1261
    invoke-static {v4, v0, v1, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    sput-object v1, Lby8;->O0:Lay8;

    .line 1266
    .line 1267
    sget-object v1, Lrx8;->x:Lrx8;

    .line 1268
    .line 1269
    const-string v4, "measurement.rb.attribution.client2"

    .line 1270
    .line 1271
    invoke-static {v4, v0, v1, v12}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    sput-object v1, Lby8;->P0:Lay8;

    .line 1276
    .line 1277
    sget-object v1, Ldx8;->y:Ldx8;

    .line 1278
    .line 1279
    const-string v4, "measurement.rb.attribution.uuid_generation"

    .line 1280
    .line 1281
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    sput-object v1, Lby8;->Q0:Lay8;

    .line 1286
    .line 1287
    sget-object v1, Lfx8;->y:Lfx8;

    .line 1288
    .line 1289
    const-string v4, "measurement.rb.attribution.enable_trigger_redaction"

    .line 1290
    .line 1291
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v1

    .line 1295
    sput-object v1, Lby8;->R0:Lay8;

    .line 1296
    .line 1297
    sget-object v1, Lnx8;->z:Lnx8;

    .line 1298
    .line 1299
    const-string v4, "measurement.client.sessions.enable_fix_background_engagement"

    .line 1300
    .line 1301
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v1

    .line 1305
    sput-object v1, Lby8;->S0:Lay8;

    .line 1306
    .line 1307
    sget-object v1, Lhx8;->y:Lhx8;

    .line 1308
    .line 1309
    const-string v4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    .line 1310
    .line 1311
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1312
    .line 1313
    .line 1314
    sget-object v1, Ljx8;->y:Ljx8;

    .line 1315
    .line 1316
    const-string v4, "measurement.remove_conflicting_first_party_apis.dev"

    .line 1317
    .line 1318
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1319
    .line 1320
    .line 1321
    sget-object v1, Llx8;->y:Llx8;

    .line 1322
    .line 1323
    const-string v4, "measurement.rb.attribution.service.trigger_uris_high_priority"

    .line 1324
    .line 1325
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    sput-object v1, Lby8;->T0:Lay8;

    .line 1330
    .line 1331
    sget-object v1, Lnx8;->y:Lnx8;

    .line 1332
    .line 1333
    const-string v4, "measurement.experiment.enable_phenotype_experiment_reporting"

    .line 1334
    .line 1335
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    sput-object v1, Lby8;->U0:Lay8;

    .line 1340
    .line 1341
    sget-object v1, Lpx8;->y:Lpx8;

    .line 1342
    .line 1343
    const-string v4, "measurement.experiment.enable_passthrough_experiment_reporting"

    .line 1344
    .line 1345
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v1

    .line 1349
    sput-object v1, Lby8;->V0:Lay8;

    .line 1350
    .line 1351
    sget-object v1, Ls63;->y:Ls63;

    .line 1352
    .line 1353
    const-string v4, "measurement.set_default_event_parameters.fix_service_request_ordering"

    .line 1354
    .line 1355
    invoke-static {v4, v2, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    sput-object v1, Lby8;->W0:Lay8;

    .line 1360
    .line 1361
    sget-object v1, Ln63;->x:Ln63;

    .line 1362
    .line 1363
    const-string v4, "measurement.set_default_event_parameters.fix_app_update_logging"

    .line 1364
    .line 1365
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    sput-object v1, Lby8;->X0:Lay8;

    .line 1370
    .line 1371
    sget-object v1, Lts2;->x:Lts2;

    .line 1372
    .line 1373
    const-string v4, "measurement.service.fix_stop_bundling_bug"

    .line 1374
    .line 1375
    invoke-static {v4, v0, v1, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    sput-object v0, Lby8;->Y0:Lay8;

    .line 1380
    .line 1381
    sget-object v0, Lhx8;->z:Lhx8;

    .line 1382
    .line 1383
    const-string v1, "measurement.gbraid_campaign.stop_lgclid"

    .line 1384
    .line 1385
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    sput-object v0, Lby8;->Z0:Lay8;

    .line 1390
    .line 1391
    sget-object v0, Lfx8;->z:Lfx8;

    .line 1392
    .line 1393
    const-string v1, "measurement.gbraid_campaign.deep_link_url"

    .line 1394
    .line 1395
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    sput-object v0, Lby8;->a1:Lay8;

    .line 1400
    .line 1401
    sget-object v0, Ltz2;->y:Ltz2;

    .line 1402
    .line 1403
    const-string v1, "gclid,gbraid,gad_campaignid"

    .line 1404
    .line 1405
    const-string v4, "measurement.gbraid_compaign.compaign_params_triggering_info_update"

    .line 1406
    .line 1407
    invoke-static {v4, v1, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    sput-object v0, Lby8;->b1:Lay8;

    .line 1412
    .line 1413
    sget-object v0, Lor2;->x:Lor2;

    .line 1414
    .line 1415
    const-string v1, "measurement.edpb.service"

    .line 1416
    .line 1417
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    sput-object v0, Lby8;->c1:Lay8;

    .line 1422
    .line 1423
    sget-object v0, Lz53;->y:Lz53;

    .line 1424
    .line 1425
    const-string v1, "measurement.edpb.events_cached_in_no_data_mode"

    .line 1426
    .line 1427
    const-string v4, "_f,_v,_cmp"

    .line 1428
    .line 1429
    invoke-static {v1, v4, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    sput-object v0, Lby8;->d1:Lay8;

    .line 1434
    .line 1435
    sget-object v0, Llx8;->z:Llx8;

    .line 1436
    .line 1437
    const-string v1, "measurement.robust_time_source_2"

    .line 1438
    .line 1439
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    sput-object v0, Lby8;->e1:Lay8;

    .line 1444
    .line 1445
    sget-object v0, Ljx8;->z:Ljx8;

    .line 1446
    .line 1447
    const-string v1, "measurement.manual_iap_logging.client_service"

    .line 1448
    .line 1449
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    sput-object v0, Lby8;->f1:Lay8;

    .line 1454
    .line 1455
    sget-object v0, Ln63;->y:Ln63;

    .line 1456
    .line 1457
    const-string v1, "measurement.dsid_consent_only.app_allowlist1"

    .line 1458
    .line 1459
    invoke-static {v1, v10, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    sput-object v0, Lby8;->g1:Lay8;

    .line 1464
    .line 1465
    sget-object v0, Ls63;->z:Ls63;

    .line 1466
    .line 1467
    const-string v1, "measurement.dsid_consent_only.app_allowlist2"

    .line 1468
    .line 1469
    invoke-static {v1, v10, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    sput-object v0, Lby8;->h1:Lay8;

    .line 1474
    .line 1475
    sget-object v0, Lhr2;->B:Lhr2;

    .line 1476
    .line 1477
    const-string v1, "measurement.dsid_consent_only.app_allowlist3"

    .line 1478
    .line 1479
    invoke-static {v1, v10, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    sput-object v0, Lby8;->i1:Lay8;

    .line 1484
    .line 1485
    sget-object v0, Lhr2;->A:Lhr2;

    .line 1486
    .line 1487
    const-string v1, "measurement.diagnostics.enabled"

    .line 1488
    .line 1489
    invoke-static {v1, v2, v0, v3}, Lby8;->a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    sput-object v0, Lby8;->j1:Lay8;

    .line 1494
    .line 1495
    return-void
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Lfs8;Z)Lay8;
    .locals 1

    .line 1
    new-instance v0, Lay8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lay8;-><init>(Ljava/lang/String;Ljava/lang/Object;Lfs8;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
