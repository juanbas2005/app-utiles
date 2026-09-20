.class public final Ltn8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ln79;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lpn8;->c:Lrg4;

    .line 2
    .line 3
    iget-object v0, v0, Lrg4;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Luw2;

    .line 6
    .line 7
    new-instance v1, Ln79;

    .line 8
    .line 9
    const-string v2, "measurement.service.storage_consent_support_version"

    .line 10
    .line 11
    const-wide/32 v3, 0x31b50

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3, v4}, Ln79;-><init>(Ljava/lang/String;Luw2;J)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ltn8;->a:Ln79;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method
