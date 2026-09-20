.class public final Lzn8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lg79;

.field public static final b:Lg79;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lpn8;->c:Lrg4;

    .line 2
    .line 3
    const-string v1, "measurement.set_default_event_parameters.fix_app_update_logging"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v0, v1, v2}, Lrg4;->t(Ljava/lang/String;Z)Lg79;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sput-object v1, Lzn8;->a:Lg79;

    .line 11
    .line 12
    const-string v1, "measurement.set_default_event_parameters.fix_service_request_ordering"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Lrg4;->t(Ljava/lang/String;Z)Lg79;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lzn8;->b:Lg79;

    .line 20
    .line 21
    return-void
.end method
