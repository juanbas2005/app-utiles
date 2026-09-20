.class public final Lbp8;
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
    const-string v1, "measurement.experiment.enable_passthrough_experiment_reporting"

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
    sput-object v1, Lbp8;->a:Lg79;

    .line 11
    .line 12
    const-string v1, "measurement.experiment.enable_phenotype_experiment_reporting"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lrg4;->t(Ljava/lang/String;Z)Lg79;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lbp8;->b:Lg79;

    .line 19
    .line 20
    return-void
    .line 21
.end method
